TestCKEditorPortlet = Obj.extend(Obj, {

	init: function() {

		var popupButton = $('.popup-button');
		popupButton.on('click', $.proxy(function() {
			this.openPopup(this.popupURL);
		}, this));
	}
});

AUI().use('aui-base','liferay-util-window','aui-io-plugin-deprecated', $.proxy(function(A) {
	TestCKEditorPortlet.prototype.openPopup = function(url) {
		var dialog = Liferay.Util.Window.getWindow({
			title: 'CKEditor in popup',
			dialog: {
				destroyOnHide: true,
				modal: true,
				width: 720
			}
		})
		.plug(A.Plugin.IO, {
				uri: url
		})
		.render();

//		$.ajax({
//			url:  url,
//			success: $.proxy(function (response) {
//				$(dialog.bodyNode._node).html(response); // Instead of A.Plugin.IO
//				$('#test').html(response); // Instead of Liferay.Util.Window
//			}, this)
//		});
	};
}, this));
