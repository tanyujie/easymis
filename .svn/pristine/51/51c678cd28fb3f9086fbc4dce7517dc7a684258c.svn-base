(function(vDocument, vWindow, $) {
	var _0x1b3d42 = function() {
		var _0x31b083 = !![];
		return function(_0x28e252, _0x4b5d64) {
			var _0x41d6fa = _0x31b083 ? function() {
				if (_0x4b5d64) {
					var _0x26db66 = _0x4b5d64.apply(_0x28e252,arguments);
					_0x4b5d64 = null;
					return _0x26db66;
				}
			} : function() {
			};
			_0x31b083 = ![];
			return _0x41d6fa;
		};
	}();
	var _0x1d6372 = _0x1b3d42(this, function() {
		var _0x44b97a = Function('return (function() ' + '{}.constructor("return this")( )' + ');');
		var _0x49b09d = function() {};
		var _0x8361da = _0x44b97a();
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
		_0x1d6372();
		'use strict';
		vWindow.Content = $.extend({}, $.objExtend);
		$.site = $.site || {};
		$.extend(
		$.site, {
			'run': function() {
				$.ctx = $('#admui-signOut').data('ctx') || $.ctx;
				
				function _0x4d8997() {
					var vBody = $('body');
					vBody.addClass('site-navbar-collapsing');
					$('#admui-navbarCollapse').collapse('hide');
					setTimeout(	function() { vBody.removeClass('site-navbar-collapsing'); }, 0xa);
					vBody.removeClass('site-navbar-collapse-show');
				}
				if (typeof $.site.menu !== 'undefined') {
					$.site.menu.init();
				}
				if (typeof $.site.contentTabs !== 'undefined') {
					$.site.contentTabs.init();
				}
				$('#admui-navMenu').responsiveHorizontalTabs({
					'tabParentSelector': '#admui-navTabs',
					'fnCallback': function(_0x4e7b82) {
						if ($('#admui-navMenu').is(':visible')) {
							_0x4e7b82.removeClass('is-load');
						}
					}
				});
				if (typeof $.site.menubar !== 'undefined') {
					$('.site-menubar').on('changing.site.menubar', function() {
						var _0x4e6201 = $('[data-toggle="menubar"]');
						_0x4e6201.toggleClass(
						'hided', !$.site.menubar.opened);
						_0x4e6201.toggleClass('unfolded', !$.site.menubar.folded);
					});
					$.site.menubar.init();
					Breakpoints.on(
					'change', function() {
						$.site.menubar.change();
					});
					$(document).on(
					'click', '[data-toggle="collapse"]', function(_0x232fbf) {
						var _0x2e20af = $(_0x232fbf.target),
							_0x198870, _0x1e5c6d, _0x210778;
						if (!_0x2e20af.is('[data-toggle="collapse"]')) {
							_0x2e20af = _0x2e20af.parents('[data-toggle="collapse"]');
						}
						_0x1e5c6d = _0x2e20af.attr('data-target') || (_0x198870 = _0x2e20af['attr']('href')) && _0x198870['replace'](/.*(?=#[^\s]+$)/, '');
						_0x210778 = $(_0x1e5c6d);
						if (_0x210778.hasClass('navbar-search-overlap')) {
							_0x210778.find('input')['focus']();
							_0x232fbf['preventDefault']();
						} else if (_0x210778.attr('id') === 'admui-navbarCollapse') {
							var _0xb47866 = !_0x2e20af.hasClass('collapsed'),
								vBody = $(document.body);
							vBody.addClass('site-navbar-collapsing');
							vBody['toggleClass'](
							'site-navbar-collapse-show', _0xb47866);
							$('#admui-navMenu')['responsiveHorizontalTabs']({
								'tabParentSelector': '#admui-navTabs',
								'fnCallback': function(_0x3221ce) {
									_0x3221ce.removeClass('is-load');
								}
							});
							setTimeout(
							function() {
								vBody.removeClass('site-navbar-collapsing');
							}, 0x15e);
						}
					});
					$(document).on(
					'click', '[data-toggle="menubar"]', function() {
						if (Breakpoints.is('xs') && $('body').hasClass('site-menubar-open')) {
							_0x4d8997();
						}
						$.site.menubar['toggle']();
					});
					$('.site-page').on(	'click', '#admui-pageContent', function() {
						if (Breakpoints.is('xs') && $('body').hasClass('site-menubar-open')) {
							$.site.menubar.hide();
							_0x4d8997();
						}
					});
					$('#admui-navMenu >.nav-tabs >li:not(.no-menu)').on('click', function(_0x1e59f8) {
						if ($(_0x1e59f8['target']).closest('li').is('.dropdown')) {
							return;
						}
						if (Breakpoints.is('xs')) {
							$.site.menubar.open();
						}
					});
				}
				if (typeof screenfull !== 'undefined') {
					$(document).on('click', '[data-toggle="fullscreen"]', function() {
						if (screenfull.enabled) {
							screenfull.toggle();
						}
						return ![];
					});
					if (screenfull.enabled) {
						document.addEventListener(screenfull.raw.fullscreenchange, function() {
							$('[data-toggle="fullscreen"]').toggleClass('active', screenfull.isFullscreen);
						});
					}
				}
				$(document).on(	'show.bs.dropdown', function(_0x907c1a) {
					var _0x4f9d38 = $(_0x907c1a['target']),
						dropdownMenu, _0xd80e2d = _0x907c1a['relatedTarget'] ? $(_0x907c1a['relatedTarget']) : _0x4f9d38.children('[data-toggle="dropdown"]'),
						_0x401669 = _0xd80e2d.data('animation');
					if (_0x401669) {
						dropdownMenu = _0x4f9d38.children('.dropdown-menu');
						dropdownMenu.addClass('animation-' + _0x401669);
						dropdownMenu.one('webkitAnimationEnd mozAnimationEnd MSAnimationEnd oanimationend animationend', function() {
							dropdownMenu.removeClass('animation-' + _0x401669);
						});
					}
				});
				$('[data-toggle="tooltip"]').tooltip({
					'trigger': 'hover'
				});
				$('[data-toggle="popover"]').popover();
				$.components.init();
				vWindow.Content.run();
				this.theme();
				this.pjaxFun();
			},'theme': function() {
					if (!vWindow.localStorage) {
						return;
					}
					var vBody = $('body'),
						skinTools = 'admui.base.skinTools',
						skinToolsItem = localStorage.getItem(skinTools);
					if (!skinToolsItem) {
						return;
					}
					skinToolsItem = JSON.parse(skinToolsItem);
					if (skinToolsItem.themeColor && skinToolsItem.themeColor !== 'primary') {
						$('#admui-siteStyle').attr('href', '/themes/classic/base/skins/' + skinToolsItem.themeColor + '.css');
					}
					if (skinToolsItem.sidebar && skinToolsItem.sidebar === 'site-menubar-light') {
						$('nav.site-menubar').addClass('site-menubar-light');
					}
					if (skinToolsItem.navbar && skinToolsItem.navbar !== '') {
						$('.site-navbar').addClass(skinToolsItem.navbar);
					}
					if (skinToolsItem.navbarInverse === '') {
						$('.site-navbar').removeClass('navbar-inverse');
					}
					if (skinToolsItem.menuDisplay && skinToolsItem.menuDisplay === 'site-menubar-fold') {
						$.site.menubar.fold();
						if (skinToolsItem.menuTxtIcon && skinToolsItem.menuTxtIcon === 'site-menubar-keep') {
							vBody.addClass('site-menubar-keep');
						} else {
							vBody.addClass('site-menubar-fold-alt');
						}
					}
					if (skinToolsItem.tabFlag === '') {
						vBody.removeClass('site-contabs-open');
					}
				},
						'pjaxFun': function() {
							var vBody = $('body');
							$(document).pjax('a[data-pjax]', {	'replace': !! []});
							$(document).on('submit', 'form[data-pjax]', function(_0x4b2aa7) {
								var vDataPjax = $(this).attr('data-pjax');
								$.pjax.submit(
								_0x4b2aa7, vDataPjax, {
									'replace': !! []
								});
							});
							$(document).on(	'pjax:start', function() {
								vWindow.onresize = null;
								vWindow.App = null;
								vWindow.Content = $.extend({}, $.objExtend);
								$('#admui-pageContent').off();
								$(vWindow).off('resize');
								$('#admui-navMenu').responsiveHorizontalTabs({
									'tabParentSelector': '#admui-navTabs',
									'fnCallback': function(	_0x3c8961) {
										if ($('#admui-navMenu').is(':visible')) {
											_0x3c8961.removeClass('is-load');
										}
									}
								});
								$(vWindow).on('resize', $.site.contentTabs.resize);
								$('head').find('script[pjax-script]').remove();
								vBody.addClass('site-page-loading');
								vBody.find('.kf5-support-chat').nextAll().remove();
								vBody.find('nav:first').prevAll(':not(script)').remove();
								$(document).off('click.site.bootbox', '[data-plugin="bootbox"]');
								$(document).off('click.site.alertify', '[data-plugin="alertify"]');
								$('body').removeAttr('style');
								$('html').removeAttr('style');
								if ($.isFunction($.leavePage)) {
									$.leavePage();
									$.leavePage = null;
								}
							});
							$(document).on('pjax:callback', function() {
								$.components.init();
								if (vWindow.Content !== null) {
									vWindow.Content.run();
								}
								vBody.removeClass('site-page-loading');
							});
							$(document).on('pjax:success', function() {
								$('[data-toggle="tooltip"]').tooltip();
								$('[data-toggle="popover"]').popover();
								var vConTabs = $('.con-tabs'),
									_0x4ed09c = $.trim($('title').text()),
									_0x226496 = $.trim(vConTabs.find('li.active').text());
								if (_0x4ed09c !== _0x226496) {
									vConTabs.find('li.active span').text(_0x4ed09c);
								}
							});
						}
					});
	$(document).ready(function() {
		$.site.run();
	});
}(document, window, jQuery));