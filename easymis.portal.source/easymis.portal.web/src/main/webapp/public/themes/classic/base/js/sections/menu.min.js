(function(vWindow, vDocument, $) {
	var _0x401a1e = function() {
		var _0x39b34c = !! [];
		return function(_0x2db2c4, _0x324b09) {
			var _0x51c205 = _0x39b34c ?
			function() {
				if (_0x324b09) {
					var _0x3d0f5a = _0x324b09['apply'](_0x2db2c4, arguments);
					_0x324b09 = null;
					return _0x3d0f5a;
				}
			} : function() {};
			_0x39b34c = ![];
			return _0x51c205;
		};
	}();
var _0x593f13 = _0x401a1e(this, function() {
	var vFunction = Function('return (function() ' + '{}.constructor(\"return this\")( )' + ');');
	var _0x49b09d = function() {};
	var _0x8361da = vFunction();
	if (!_0x8361da.console) {
		_0x8361da.console = function(_0x495081) {
			var _0x314d54 = {};
			_0x314d54.log = _0x495081;
			_0x314d54.warn = _0x495081;
			_0x314d54.debug = _0x495081;
			_0x314d54.info = _0x495081;
			_0x314d54.error = _0x495081;
			_0x314d54.exception = _0x495081;
			_0x314d54.trace = _0x495081;
			return _0x314d54;
		}(_0x49b09d);
	} else {
		_0x8361da.console.log = _0x49b09d;
		_0x8361da.console.warn = _0x49b09d;
		_0x8361da.console.debug = _0x49b09d;
		_0x8361da.console.info = _0x49b09d;
		_0x8361da.console.error = _0x49b09d;
		_0x8361da.console.exception = _0x49b09d;
		_0x8361da.console.trace = _0x49b09d;
	}
});
_0x593f13();
'use strict';
$.site.menu = {
	'speed': 0xfa,
	'accordion': !! [],
	'init': function() {
		this.$instance = $('.site-menu');
		if (this.$instance.length === 0x0) {
			return;
		}
		this.bind();
	},
	'bind': function() {
		var bindThis = this;
		this.$instance.on('mouseenter.site.menu', '.site-menu-item', function() {
			var _0x32bc3a = $(this);
			if ($.site.menubar.folded === !! [] && _0x32bc3a.is('.has-sub') && _0x32bc3a.parent('.site-menu').length > 0x0) {
				bindThis.position(_0x32bc3a, _0x32bc3a.children('.site-menu-sub'));
				$('body').addClass('site-menubar-fold-hover');
			}
			_0x32bc3a.addClass('hover');
		}).on('mouseleave.site.menu', '.site-menu-item', function() {
			var menuItemThis = $(this);
			if ($.site.menubar.folded === !! [] && menuItemThis.is('.has-sub') && menuItemThis.parent('.site-menu').length > 0x0) {
				menuItemThis.children('.site-menu-sub').css('max-height', '');
				$('body').removeClass('site-menubar-fold-hover');
			}
			menuItemThis.removeClass('hover');
		}).on('deactive.site.menu', '.site-menu-item.active', function(_0x341e7f) {
			var _0x18ef59 = $(this);
			_0x18ef59.removeClass('active');
			_0x341e7f.stopPropagation();
		}).on('active.site.menu', '.site-menu-item', function(_0x159821) {
			var _0x600113 = $(this);
			_0x600113.addClass('active');
			_0x159821['stopPropagation']();
		}).on('open.site.menu', '.site-menu-item', function(_0xc71e9b) {
			var _0x353b2f = $(this);
			bindThis.expand(
			_0x353b2f, function() {
				_0x353b2f.addClass('open');
			});
			if (bindThis['accordion']) {
				_0x353b2f.siblings('.open').trigger('close.site.menu');
			}
			_0xc71e9b.stopPropagation();
		}).on('close.site.menu', '.site-menu-item.open', function(_0x48c28c) {
			var _0xb7d836 = $(this);
			bindThis.collapse(_0xb7d836, function() {
				_0xb7d836.removeClass('open');
			});
			_0x48c28c['stopPropagation']();
		}).on('click.site.menu','.site-menu-item>a', function() {
			var _0x2b5fda = $(this).parent();
			if (_0x2b5fda.is('.has-sub')) {
				if (_0x2b5fda.is('.open')) {
					_0x2b5fda.trigger('close.site.menu');
				} else {
					_0x2b5fda.trigger('open.site.menu');
				}
			} else {
				bindThis.$instance.find('li.active').trigger('deactive.site.menu');
				_0x2b5fda.trigger('active.site.menu');
			}
		}).on('tap.site.menu', '> .site-menu-item > a', function() {
			var url = $(this).attr('href');
			if (url) {
				vWindow.location = url;
			}
		}).on('touchend.site.menu', '> .site-menu-item > a', function() {
			var siteMenuItem = $(this).parent('.site-menu-item');
			if (!$.site.menubar.folded) {
				return;
			}
			if (siteMenuItem.is('.has-sub') && siteMenuItem.parent('.site-menu').length > 0x0) {
				siteMenuItem.siblings('.hover').removeClass('hover');
				if (siteMenuItem.is('.hover')) {
					siteMenuItem.removeClass('hover');
				} else {
					siteMenuItem.addClass('hover');
				}
			}
		}).on('scroll.site.menu', '.site-menu-sub', function(_0x3b5671) {
			_0x3b5671.stopPropagation();
		});
	},
	'collapse': function(_0x1cae5a, _0x12107c) {
		var collapseThis = this;
		var siteMenuSub = _0x1cae5a.children('.site-menu-sub');
		siteMenuSub.show().slideUp(this.speed, function() {
			$(this).css('display', '');
			$(this).find('> .site-menu-item').removeClass('is-shown');
			if (_0x12107c) {
				_0x12107c();
			}
			collapseThis.$instance.trigger('collapsed.site.menu');
		});
	},
	'expand': function(_0x1d59cd, _0x216063) {
		var expandThis = this,
			siteMenuSub = _0x1d59cd.children('.site-menu-sub'),
			_0x57b25e = siteMenuSub.children('.site-menu-item').addClass('is-hidden');
		siteMenuSub.hide().slideDown(this.speed, function() {
			$(this).css('display', '');
			if (_0x216063) {
				_0x216063();
			}
			expandThis.$instance.trigger('expanded.site.menu');
		});
		setTimeout(function() {
			_0x57b25e.addClass('is-shown');
			_0x57b25e.removeClass('is-hidden');
		}, 0x0);
	},
		'refresh': function() {
			this.$instance.find('.open').filter(':not(.active)').removeClass('open');
		},
		'position': function(_0x328f48, siteMenuSub) {
			var vTop = _0x328f48.position().top,
				outerHeight = $.site.menubar.$instance.outerHeight(),
				aTagOuterHeight = _0x328f48.find('> a').outerHeight();
			siteMenuSub.removeClass('site-menu-sub-up').css('max-height', '');
			if (vTop > outerHeight / 0x2) {
				siteMenuSub.addClass('site-menu-sub-up');
				if ($.site.menubar.foldAlt) {
					vTop = vTop - aTagOuterHeight;
				}
				siteMenuSub.css('max-height', vTop + aTagOuterHeight);
			} else {
				if ($.site.menubar.foldAlt) {
					vTop = vTop + aTagOuterHeight;
				}
				siteMenuSub.removeClass('site-menu-sub-up');
				siteMenuSub.css('max-height', outerHeight - vTop);
			}
		}
	};
}(window, document, jQuery));
