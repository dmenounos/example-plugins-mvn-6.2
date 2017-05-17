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
			title: 'Popup with CKEditor',
			dialog: {
				destroyOnHide: true,
				modal: true,
				width: 1024
			}
		})
		.plug(A.Plugin.DialogIframe, {
			iframeCssClass: 'dialog-iframe',
			uri: url
		})
		.render();

//		$.ajax({
//			url:  url,
//			success: $.proxy(function (response) {
//				// hack to remove the ckeditor main script -->
//				var re = new RegExp('<script src="/html/js/editor/ckeditor/ckeditor.js[^>]+></script>', 'g');
//				// console.log(re.exec(response));
//				if (re.test(response)) {
//					response = response.replace(re, '');
//				}
//				// <--
//				$(dialog.bodyNode._node).html(response); // Instead of A.Plugin.IO
//			}, this)
//		});
	};
}, this));
