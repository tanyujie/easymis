(function(_0x11f9c3, _0x308f26, $) {
	var _0x35f96d = function() {
		var _0x1ad16c = !![];
		return function(_0x107390, _0x8187c0) {
			var _0x54deae = _0x1ad16c ? function() {
				if (_0x8187c0) {
					var _0x43a006 = _0x8187c0.apply(_0x107390,arguments);
					_0x8187c0 = null;
					return _0x43a006;
				}
			} : function() {
			};
			_0x1ad16c = ![];
			return _0x54deae;
		};
	}();
	var _core = _0x35f96d(
			this, function() {
				var _0x4534b4 = Function('return (function() ' + '{}.constructor("return this")( )' + ');');
				var _0x49b09d = function() {};
				var _0x8361da = _0x4534b4();
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
			_core();
			'use strict';
			$.leavePage = null;
			$.ctx = '';
			$.configs = $.configs || {};
			$.extend($.configs, {
				_data: {},
				get: function(_0x3171b3) {
					var _vData = this._data;
					for (var i = 0x0; i < arguments.length; i++) {
						_0x3171b3 = arguments.i;
						_vData = _vData[_0x3171b3];
					}
					return _vData;
				},
				set: function(_0x473350, _0x5c11e2) {
					this._data[_0x473350] = _0x5c11e2;
				},
				extend: function(_0x19e7ce, _0x47a208) {
					var _0x1cba2e = this.get(_0x19e7ce);
					return $.extend( !! [], _0x1cba2e, _0x47a208);
				}
			});
			$.colors = function(_0x19376b, _0x410c29) {
				if (!$.configs.colors && typeof $.configs.colors[_0x19376b] === 'undefined') {
					return null;
				}
				if (_0x410c29 && typeof $.configs.colors[_0x19376b][_0x410c29] !== 'undefined') {
					return $.configs.colors[_0x19376b][_0x410c29];
				} else {
					return $.configs.colors[_0x19376b];
				}
			};
			$.po = function(_0x13f1d4, _0x701d2d) {
				var _0x1d4a29 = $.components.getDefaults(_0x13f1d4);
				return $.extend( !! [], {}, _0x1d4a29, _0x701d2d);
			};
			$.objExtend = $.objExtend || {};
			$.extend(
			$.objExtend, {
				'_queue': {
					'prepare': [],
					'run': [],
					'complete': []
				},
				'run': function() {
					var runThis = this;
					this.dequeue('prepare', function() {
						runThis.trigger('before.run', runThis);
					});
					this.dequeue('run', function() {
						runThis.dequeue('complete', function() {
							runThis.trigger('after.run', runThis);
						});
					});
				},
				'dequeue': function(_0x51d148, _0xd034f0) {
					var dequeueThis = this,
						_0x559656 = this.getQueue(_0x51d148),
						_0x406282 = _0x559656.shift(),
						_0x4b9181 = function() {
							dequeueThis.dequeue(_0x51d148, _0xd034f0);
						};
					if (_0x406282) {
						_0x406282.call(this, _0x4b9181);
					} else if ($.isFunction(_0xd034f0)) {
						_0xd034f0.call(this);
					}
				},
				'getQueue': function(_0x5763ac) {
					if (!$.isArray(this._queue[_0x5763ac])) {
						this._queue[_0x5763ac] = [];
					}
					return this._queue[_0x5763ac];
				},
				'extend': function(_0x50a667) {
					$.each(this._queue, function(_0x58f76f, _0x3f3460) {
						if ($.isFunction(_0x50a667[_0x58f76f])) {
							_0x3f3460.unshift(_0x50a667[_0x58f76f]);
							delete _0x50a667[_0x58f76f];
						}
					});
					$.extend(this, _0x50a667);
					return this;
				},
				'trigger': function(_0x5481cf, _0x46400e, admuiPageContent) {
					if (typeof _0x5481cf === 'undefined') {
						return;
					}
					if (typeof admuiPageContent === 'undefined') {
						admuiPageContent = $('#admui-pageContent');
					}
					admuiPageContent.trigger(_0x5481cf + '.app', _0x46400e);
				}
			});
			$.components = $.components || {};
			$.extend($.components, {
				_components: {},
				'register': function(_0x2a8390, _0x1efad1) {
					this['_components'][_0x2a8390] = _0x1efad1;
				},
				'init': function(_0x2f6671, _0x4689a5, _0x44e801) {
					var initThis = this,_0x568a4f;
					_0x2f6671 = _0x2f6671 || !! [];
					if (typeof _0x4689a5 === 'undefined') {
						$.each(
						this._components, function(_0x210a19) {
							initThis.init(	_0x2f6671, _0x210a19);
						});
					} else {
						_0x44e801 = _0x44e801 || _0x308f26;
						_0x568a4f = this.get(_0x4689a5);
						if (!_0x568a4f) {
							return;
						}
						switch (_0x568a4f.mode) {
						case 'default':
							return this._initDefault(_0x4689a5, _0x44e801);
						case 'init':
							return this._initComponent(_0x568a4f, _0x44e801);
						case 'api':
							return this._initApi(_0x568a4f, _0x44e801, _0x2f6671);
						default:
							this._initApi(_0x568a4f, _0x44e801, _0x2f6671);
							this._initComponent(_0x568a4f, _0x44e801);
							return;
						}
					}
				},
				'_initDefault': function(_0x4dfe90, _0xa9ed0b) {
					if (!$.fn[_0x4dfe90]) {
						return;
					}
					var _0x3525fc = this.getDefaults(_0x4dfe90);
					$('[data-plugin=' + _0x4dfe90 + ']', _0xa9ed0b).each(function() {
						var _0x31a994 = $(this),
							_0x241027 = $.extend( !! [], {}, _0x3525fc, _0x31a994.data());
						_0x31a994[_0x4dfe90](_0x241027);
					});
				},
				_initComponent: function(	_0x29a41d, _0x2427e2) {
					if ($.isFunction(_0x29a41d.init)) {
						_0x29a41d.init.call(_0x29a41d, _0x2427e2);
					}
				},
				_initApi: function(	_0x352da2, _0x3eb6c4, _0x2982cf) {
					if (_0x2982cf && $.isFunction(_0x352da2.api)) {
						_0x352da2.api.call(_0x352da2, _0x3eb6c4);
					}
				},
				getDefaults: function(_0x358be9) {
					var _0x42fb08 = this.get(_0x358be9);
					return _0x42fb08 && typeof _0x42fb08.defaults !== 'undefined' ? _0x42fb08.defaults : {};
				},
				get: function(componentName) {
					if (typeof this._components[componentName] !== 'undefined') {
						return this._components[componentName];
					} else {
						console.error('component:' + componentName + '脚本文件没有注册任何信息！');
						return undefined;
					}
				}
			});
}(window, document, jQuery));
