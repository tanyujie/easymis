(function(vDocument, vWindow, $) {
	var _0x906f4a = function() {
		var _0x1f16d6 = !![];
		return function(_0x23ad34, _0x6adedd) {
			var _0x5c5912 = _0x1f16d6 ? function() {
				if (_0x6adedd) {
					var _0x59766b = _0x6adedd.apply(_0x23ad34,arguments);
					_0x6adedd = null;
					return _0x59766b;
				}
			} : function() {
			};
			_0x1f16d6 = ![];
			return _0x5c5912;
		};
	}();
	var _0x36e707 = _0x906f4a(this,
			function() {
		var _0x463736 = Function('return (function() ' + '{}.constructor("return this")( )' + ');');
				var _0x49b09d = function() {};
				var _0x8361da = _0x463736();
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
	_0x36e707();
	'use strict';
	$(function() {
		var _dataTable, _0x4f458b, _admuiPageContent = $('#admui-pageContent');
		_dataTable = $('.dataTable').DataTable($.po('dataTable', {
			'autoWidth': ![],
			'processing': !! [],
			'rowId': 'configId',
			'columns': [{
				'data': 'url'
			}, {
				'data': 'type'
			}, {
				'data': 'createUser.loginName'
			}, {
				'data': 'createTime'
			}, {
				'render': function() {
					return '<div class="btn-group btn-group-sm"><button type="button"' + ' class="btn btn-icon btn-pure btn-default edit-row" data-target="#logsForm"' + ' data-toggle="modal"><i class="icon wb-edit" aria-hidden="true"></i>' + '</button><button type="button" class="btn btn-icon btn-pure btn-default' + ' delete-row"><i class="icon wb-close" aria-hidden="true"></i></button></div>';
				}
			}]
		}));
		$('#compileRoleForm').formValidation($.po('formValidation', {
			'fields': {
				'url': {
					'validators': {
						'notEmpty': {
							'message': '请填写URL地址'
						}
					}
				},
				'type': {
					'validators': {
						'notEmpty': {
							'message': '请填写URL对应名称'
						}
					}
				}
			}
		})).on('success.form.fv', function(_0x15bd21) {
			_0x15bd21['preventDefault']();
			var _0x2525ae = $(_0x15bd21.target)['data']('formValidation'),
				_0x20f1a3 = {
					'url': _0x2525ae['getFieldElements']('url')['val'](),
					'type': _0x2525ae['getFieldElements']('type')['val']()
				},
				_0x3e0603 = _0x4f458b === null ? '' : _dataTable['row'](_0x4f458b)['id']();

			function _0x469485(_0x2c0188) {
				if (_0x4f458b !== null) {
					_0x4f458b['find']('td:eq(0)').text(_0x2c0188['url']);
					_0x4f458b['find']('td:eq(1)')['text'](_0x2c0188['type']);
					toastr.success('修改成功！');
				} else {
					_dataTable['row']['add'](_0x2c0188)['draw'](![]);
					toastr.success('添加成功！');
				}
			}
			$.ajax({
				'url': $['ctx'] + '/log/saveConfig?configId=' + _0x3e0603,
				'type': 'POST',
				'data': $(this).serialize(),
				'dataType': 'JSON',
				'success': function(
				_0x304be7) {
					if (_0x304be7.success) {
						_0x20f1a3.configId = _0x304be7['config']['configId'];
						_0x20f1a3['createTime'] = _0x304be7['config']['createTime'];
						_0x20f1a3['createUser'] = _0x304be7['config']['createUser'];
						$('#logsForm').one(
						'hidden.bs.modal', function() {
							_0x469485(_0x20f1a3);
						})['modal']('hide');
					} else {
						toastr.error(_0x304be7['msg']);
					}
				},
				'error': function() {
					toastr.error('服务器异常，请稍后再试！');
				}
			});
		});
		_admuiPageContent.on('hide.bs.modal', '#logsForm', function() {
			$('#compileRoleForm').formValidation('resetForm', !! []);
		});
		_admuiPageContent.on('click', '.delete-row', function() {
			var _0x875c5 = $(this)['closest']('tr'),
				_0x5bb07d, _0x5a9148 = _0x875c5['prev']();
			if (_0x875c5['hasClass']('child') && _0x5a9148['hasClass']('parent')) {
				_0x875c5 = _0x5a9148;
			}
			_0x5bb07d = _dataTable['row'](_0x875c5)['id']();
			alertify.theme('bootstrap').confirm('你确定要删除吗？', function() {
				$.ajax({
					'url': $.ctx + '/log/deleteConfig?configId=' + _0x5bb07d,
					'type': 'POST',
					'data': {
						'id': _0x5bb07d
					},
					'dataType': 'JSON',
					'success': function(data) {
						if (data.success) {
							_dataTable.row(_0x875c5).remove().draw(![]);
							toastr.success('删除成功！');
						} else {
							toastr.error(data.msg);
						}
					},
					'error': function() {
						toastr.error('服务器异常，请稍后再试！');
					}
				});
			});
		});
		_admuiPageContent.on('click', '.add-row', function() {
			_0x4f458b = null;
		});
		_admuiPageContent.on('click', '.edit-row', function() {
			_0x4f458b = $(this).closest('tr');
			var _0x2ab17f = {
				'url': _0x4f458b.find('td:eq(0)')['text'](),
				'type': _0x4f458b.find('td:eq(1)')['text']()
			};
			$('input[name="url"]').val(_0x2ab17f['url']);
			$('input[name="type"]').val(_0x2ab17f['type']);
				});
	});
}(document, window, jQuery));