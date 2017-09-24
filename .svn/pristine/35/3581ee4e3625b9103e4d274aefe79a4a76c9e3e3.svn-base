(function(vWindow, vDocument, $) {
	var _0x3b7b36 = function() {
			var _0x15348a = !! [];
			return function(_0x5a6cda, _0x44499d) {
				var _0x5befae = _0x15348a ?
				function() {
					if (_0x44499d) {
						var _0x2b8995 = _0x44499d.apply(_0x5a6cda, arguments);
						_0x44499d = null;
						return _0x2b8995;
					}
				} : function() {};
				_0x15348a = ![];
				return _0x5befae;
			};
		}();
	'use strict';
	var _identity = $('#identity'),
		_search = location.search,
		_0x3528bd = _search.indexOf('user'),
		_0x3baf1d = _search.substring(_0x3528bd, _search.length);
	_0x3baf1d = _0x3baf1d.replace('user=', '');

	function _0x3318ae(_0x485f0b) {/*
		var _0x1a6bb9 = _0x3b7b36(this, function() {
			var _0x1b836b = Function('return (function() '	+ '{}.constructor("return this")( )' + ');');
			var _0x5ee9d3 = function() {};
			var _0x116fd7 = _0x2a362b();
			if (!_0x116fd7.console) {
				_0x116fd7.console = function(_0x16ffea) {
					var _0x23be58 = {};
					_0x23be58.log = _0x16ffea;
					_0x23be58.warn = _0x16ffea;
					_0x23be58.debug = _0x16ffea;
					_0x23be58.info = _0x16ffea;
					_0x23be58.error = _0x16ffea;
					_0x23be58.exception = _0x16ffea;
					_0x23be58.trace = _0x16ffea;
					return _0x23be58;
				}(_0x5ee9d3);
			} else {
				_0x116fd7.console.log = _0x5ee9d3;
				_0x116fd7.console.warn = _0x5ee9d3;
				_0x116fd7.console.debug = _0x5ee9d3;
				_0x116fd7.console.info = _0x5ee9d3;
				_0x116fd7.console.error = _0x5ee9d3;
				_0x116fd7.console.exception = _0x5ee9d3;
				_0x116fd7.console.trace = _0x5ee9d3;
			}
		});
		_0x1a6bb9();
		var _0x29d69a = _identity.find('option[value="' + _0x485f0b + '"]').data('password');
		if (_0x3528bd !== -0x1) {
			_identity.selectpicker('val', _0x485f0b);
		}
		
		$('#loginForm').find('#username').val(_0x485f0b);
		$('#loginForm').find('#password').val(_0x29d69a);
		$('#loginForm').formValidation(	'revalidateField', 'loginName').formValidation('revalidateField', 'password');
	*/}
/*	_identity.selectpicker({'style' : 'btn-select'	});
	if (_0x3baf1d !== '') {
		_0x3318ae(_0x3baf1d);
	}
	_identity.on('change', function() {
		_0x3318ae($(this).val());
	});*/
	$('#loginForm').formValidation({
		'locale': 'zh_CN',
		'framework': 'bootstrap',
		'excluded': ':disabled',
		'autoFocus': !! [],
		'icon': {
			'valid': 'fa fa-check',
			'invalid': 'fa fa-close',
			'validating': 'fa fa-refresh'
		},
		'fields': {
			'username': {
				'validators': {
					'notEmpty': {
						'message': '用户名不能为空'
					}
				}
			},
			'password': {
				'validators': {
					'notEmpty': {
						'message':'密码不能为空'
					},
					'stringLength': {
						'min': 0x6,
						'max': 0x1e,
						'message': '密码必须大于6且小于30个字符'
					}
				}
			},
			'validCode': {
				'validators': {
					'notEmpty': {
						'enabled': !! [],
						'message': '验证码不能为空'
					}
				}
			}
		}
	});
	$('.reload-vify').on('click', function() {
		var imgTag = $(this).children('img'),
			_src = imgTag.prop('src');
		imgTag.prop('src', _src + '?tm=' + Math.random());
	});
	vWindow.KF5SupportBoxAPI.ready(function() {
		vWindow.KF5SupportBoxAPI.removeButton();
	});
	$(vDocument).on('click', '.open-kf', function(_0x2b302b) {
		_0x2b302b.preventDefault();
		vWindow.KF5SupportBoxAPI.open();
	});
}(window, document, jQuery));
