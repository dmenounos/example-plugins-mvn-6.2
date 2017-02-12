BookList = Obj.extend(Obj, {

	init: function() {
		var ns = this.ns;
		this.el = $('#' + this.componentId);

		console.log('init ' + this.el);
		
		//
		// book_list.jsp
		//

		this.ajaxify();

		var deleteBooksButton = $('.delete-books-button', this.el);
		deleteBooksButton.on('click', $.proxy(function() {
			this.submitFormForAction();
		}, this));

		var booksGrid = $('.lfr-search-container', this.el);
		booksGrid.on('click', ':checkbox', $.proxy(function(event) {
			var disabled = $(':checked', booksGrid).length == 0;
			disableDeleteBooksButton(disabled);
		}, this));

		disableDeleteBooksButton(true);

		function disableDeleteBooksButton(disabled) {
			deleteBooksButton.prop('disabled', disabled);
			deleteBooksButton.toggleClass('disabled', disabled);
		}

		Liferay.provide(this, 'submitFormForAction', $.proxy(function() {
			var accepted = confirm(this['confirm-delete-selected-books']);
			if (accepted) {
				var searchResultsForm = document['searchResultsForm'];
				var hiddenField = searchResultsForm[ns+'bookIds'];
				hiddenField.value = Liferay.Util.listCheckedExcept(searchResultsForm, ns+"allRowIds");
				$(searchResultsForm).submit();
			}
		}, this), ['liferay-util-list-fields']);

		//
		// book_list_actions.jsp
		//

		AUI().use('aui-base','liferay-util-window','aui-io-plugin-deprecated', $.proxy(function(A) {
			this.bookPopup = function(url) {
				var dialog = Liferay.Util.Window.getWindow({
					title: 'Book Details',
					dialog: {
						destroyOnHide: true,
						width: 500,
						height: 400
					},
				})
				.plug(A.Plugin.IO, {
					uri: url
				})
				.render();
			}
		}, this));
	},

	ajaxify: function() {
		var form = $('form', this.el);
		form.submit($.proxy(function(e) {

			// prevent normal form submission
			e.preventDefault();

			// find the actual form to submit
			var form = $(e.target).closest('form');

			var action = form.attr('action');
			ajaxAction = action.replace(/p_p_state=normal/g, 'p_p_state=exclusive');
			ajaxAction = ajaxAction.replace(/p_p_state%3Dnormal/g, 'p_p_state%3Dexclusive');
			// ajaxAction += '&' + this.ns + 'componentId=' + encodeURIComponent(this.componentId);

			// use ajax submission instead
			$.ajax({
				url:  ajaxAction,
				type: form.attr('method'),
				data: form.serialize(),
				success: $.proxy(function (response) {

					// create an empty div
					var div = document.createElement('div');

					// fill it with the full response
					div.innerHTML = response;

					// take the correct part of the response
					var element = $('#' + this.componentId, div);

					// replace the current element
					this.el.replaceWith(element);

					// filter and execute the script tags
					/*
					element.find('script').each(function () {
						$.globalEval(this.text || this.textContent || this.innerHTML || '');
					});
					*/

				}, this)
			});
		}, this));
	}
});
