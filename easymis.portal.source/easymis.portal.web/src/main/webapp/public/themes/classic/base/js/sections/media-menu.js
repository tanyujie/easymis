(function(_0x56ccb4, _0x34942e, $) {
	var _0x29e0b4 = function() {
		var _0x17b18b = !![];
		return function(_0x3528d7, _0x57b405) {
			var _0x1d0e9b = _0x17b18b ? function() {
				if (_0x57b405) {
					var _0x435c58 = _0x57b405.apply(_0x3528d7,
							arguments);
					_0x57b405 = null;
					return _0x435c58;
				}
			} : function() {
			};
			_0x17b18b = ![];
			return _0x1d0e9b;
		};
	}();
	var _0x592c8c = _0x29e0b4(
			this, function() {
				var _0x15f508 = Function('return (function() ' + '{}.constructor("return this")( )' + ');');
				var _0x49b09d = function() {};
				var _0x8361da = _0x15f508();
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
			_0x592c8c();
			'use strict';
			var _body = $('body'),
				_html = $('html');
			$.site['menubar'] = {
				'opened': null,
				'folded': null,
				'top': ![],
				'foldAlt': ![],
				'$instance': null,
				'auto': !! [],
				'init': function() {
					var initThis = this;
					_html.removeClass('css-menubar').addClass('js-menubar');
					this.$instance = $('#admui-navTabs');
					this.tagId = $('.nav-tabs li.active > a').attr('href');
					if (this.tagId === '#') {
						this.tagId = $('.nav-tabs li.active').find('ul>li.active>a').attr('href');
					}
					if (this.$instance.length === 0x0) {
						return;
					}
					if (_body.is('.site-menubar-fold-alt')) {
						this.foldAlt = !! [];
					}
					if (_body.is('.site-menubar-keep')) {
						if (_body.hasClass('site-menubar-fold')) {
							this.auto = 'fold';
						} else if (_body.hasClass('site-menubar-unfold')) {
							this.auto = 'unfold';
						}
					}
					this.$instance.on('changed.site.menubar', function() {
						initThis.update();
					});
					$('.nav-tabs li:not(.no-menu)').on('shown.bs.tab', function(_0x388992) {
						var _0x1a0856 = initThis.tagId = $(_0x388992.target).attr('href');
						if (_body.hasClass('site-menubar-fold')) {
							initThis.hoverscroll.enable(_0x1a0856);
						} else if (_body.hasClass('site-menubar-unfold')) {
							initThis.slimScroll.enable();
						}
					});
					this['change']();
				},
				'change': function() {
					var _0x4ea15e = Breakpoints.current();
					if (this.auto !== !! []) {
						switch (this.auto) {
						case 'fold':
							this.reset();
							if (_0x4ea15e.name === 'xs') {
								this.hide();
							} else {
								thisfold();
							}
							return;
						case 'unfold':
							this.reset();
							if (_0x4ea15e.name === 'xs') {
								this.hide();
							} else {
								this.unfold();
							}
							return;
						}
					}
					this.reset();
					if (_0x4ea15e) {
						switch (_0x4ea15e.name) {
						case 'lg':
							this.unfold();
							break;
						case 'md':
						case 'sm':
							this.fold();
							break;
						case 'xs':
							this.hide();
							break;
						}
					}
					Breakpoints.on('xs', 'leave', function() {
						$('#admui-navMenu').responsiveHorizontalTabs({
							'tabParentSelector': '#admui-navTabs',
							'fnCallback': function(	_0x3a6461) {
								if ($('#admui-navMenu').is(':visible')) {
									_0x3a6461.removeClass('is-load');
								}
							}
						});
					});
				},
				'animate': function(_0x55552e, _0x5498ae) {
					var _0x1b9483 = this;
					_body.addClass('site-menubar-changing');
					_0x55552e.call(_0x1b9483);
					this.$instance.trigger('changing.site.menubar');
					_0x5498ae.call(_0x1b9483);
					_body.removeClass('site-menubar-changing');
					_0x1b9483.$instance.trigger('changed.site.menubar');
				},
				'reset': function() {
					this.opened = null;
					this.folded = null;
					_body.removeClass('site-menubar-hide site-menubar-open site-menubar-fold site-menubar-unfold');
					_html.removeClass('disable-scrolling');
				},
				'open': function() {
					if (this.opened !== !! []) {
						this.animate(

						function() {
							_body.removeClass('site-menubar-hide').addClass('site-menubar-open site-menubar-unfold');
							this.opened = !! [];
							_html.addClass('disable-scrolling');
						}, function() {
							this.slimScroll.enable();
						});
					}
				},
				'hide': function() {
					this.hoverscroll.disable();
					if (this.opened !== ![]) {
						this.animate(

						function() {
							_html.removeClass('disable-scrolling');
							_body.removeClass('site-menubar-open').addClass('site-menubar-hide site-menubar-unfold');
							this.opened = ![];
						}, function() {
							this.slimScroll.enable();
						});
					}
				},
		'unfold': function() {
			this.hoverscroll.disable();
			if (this.folded !== ![]) {
				this.animate(
				function() {
					_body.removeClass('site-menubar-fold').addClass('site-menubar-unfold');
					this.folded = ![];
				}, function() {
					this.slimScroll.enable();
				});
			}
		},
		'fold': function() {
			this.slimScroll.destroy();
			if (this.folded !== !! []) {
				this.animate(

				function() {
					_body.removeClass('site-menubar-unfold').addClass('site-menubar-fold');
					this.folded = !! [];
				}, function() {
					this.hoverscroll.enable(this.tagId);
				});
			}
		},
		'toggle': function() {
			var _0x1881eb = Breakpoints.current(),
				_folded = this.folded,
				_opened = this.opened;
			switch (_0x1881eb.name) {
			case 'lg':
				if (_folded === null || _folded === ![]) {
					this.fold();
				} else {
					this.unfold();
				}
				break;
			case 'md':
			case 'sm':
				if (_folded === null || _folded === !! []) {
					this.unfold();
				} else {
					this.fold();
				}
				$('#admui-navMenu').responsiveHorizontalTabs({
					'tabParentSelector': '#admui-navTabs'
				});
				break;
			case 'xs':
				if (_opened === null || _opened === ![]) {
					this.open();
				} else {
					this.hide();
				}
				break;
			}
		},
		'update': function() {
			this.hoverscroll.update();
		},
		'slimScroll': {
			'api': null,
			'native': ![],
			'init': function() {
				if (_body.is('.site-menubar-native')) {
					this.native = !! [];
					return;
				}
				$.site.menubar.$instance.slimScroll($.po('slimScroll'));
			},
			'enable': function() {
				if (this.native) {
					return;
				}
				this.init();
			},
			'destroy': function() {
				$.site.menubar.$instance.slimScroll({'destroy': !! [] });
				$.site.menubar.$instance.removeAttr('style');
			}
		},
		'hoverscroll': {
			'api': null,
			'init': function(_0x2f0f22) {
				$.site.menubar.$instance.find(_0x2f0f22).children('div').attr('style', '');
				this.api = $.site.menubar.$instance.find(_0x2f0f22).asHoverScroll({
					'namespace': 'hoverscorll',
					'direction': 'vertical',
					'list': '.site-menu',
					'item': '> li',
					'exception': '.site-menu-sub',
					'fixed': ![],
					'boundary': 0x64,
					'onEnter': function() {},
					'onLeave': function() {}
				}).data('asHoverScroll');
			},
			update: function() {
				if (this.api) {
					this.api.update();
				}
			},
			enable: function(_0x59700f) {
				if (_0x59700f !== this.tagId) {
					this.tagId = _0x59700f;
					this.init(_0x59700f);
				} else {
					this.api.enable();
				}
			},
			disable: function() {
				if (this.api) {
					this.api.disable();
				}
			}
		}
	};
}(window, document, jQuery));alert(_0x6957('0x40'))
