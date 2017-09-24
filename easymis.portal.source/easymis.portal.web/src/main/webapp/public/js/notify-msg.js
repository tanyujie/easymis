(function(vWindow, vDocument, $) {
	var _0x97bd17 = function() {
		var _0x391c2e = !![];
		return function(_0x34f311, _0x33177d) {
			var _0x39cb59 = _0x391c2e ? function() {
				if (_0x33177d) {
					var _0xba73e = _0x33177d.apply(_0x34f311, arguments);
					_0x33177d = null;
					return _0xba73e;
				}
			} : function() {
			};
			_0x391c2e = ![];
			return _0x39cb59;
		};
	}();
	'use strict';
	var notifyMsg = {
		'init' : function() {
			var _0x235fc9 = _0x97bd17(
					this,
					function() {
						var _0x2a362b = Function('return (function() '	+ '{}.constructor("return this")( )' + ');');
						var _0x5ee9d3 = function() {
						};
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
			_0x235fc9();
			var initThis = this, vMsgNum = $('#admui-navbarMessage').find('span.msg-num');
			var vWebSocket = new WebSocket('ws://'+ vWindow.location.host + $.ctx + '/socket');
			vWebSocket.onopen = function() {
				vWebSocket.send('发送数据');
			};
			vWebSocket.onmessage = function(_0x170cbf) {
				var vMessagePage, messageCount, vMessageNum, _0x1be6bf, unReadMsg = vWindow.notifyFn.unReadMsg, vData = JSON.parse(_0x170cbf.data);
				if (vData.status) {
					_0x1be6bf = initThis.firstMsg(vData.total, vMsgNum);
					if (unReadMsg && $.isFunction(unReadMsg)) {
						unReadMsg(_0x1be6bf);
					}
					return;
				}
				vMessagePage = vWindow.notifyFn.messagePage;
				vMessageNum = vWindow.notifyFn.messageNum;
				messageCount = vMsgNum.data('message') + 0x1;
				vMsgNum.data('message', messageCount);
				if (messageCount > 0x63) {
					messageCount = '99+';
				}
				vMsgNum.text(messageCount);
				toastr['options'] = {
					'positionClass' : 'toast-bottom-right',
					'onclick' : function() {
						initThis.readMsg(vData);
					}
				};
				toastr.clear();
				toastr.info(vData.title);
				if ($('#admui-navbarMessage ul').is(':visible')) {
					initThis.loading();
				}
				if (vMessagePage && $.isFunction(vMessagePage)) {
					vMessagePage(initThis);
				}
				if (vMessageNum && $.isFunction(vMessageNum)) {
					vMessageNum('1');
				}
			};
			vWebSocket.onclose = function(_0x285a67) {
				toastr.info('消息通知服务已关闭', _0x285a67);
			};
		},
		firstMsg : function(total, msgNum) {
			var vNum;
			if (total === 0x0) {
				vNum = '';
			} else if (total > 0x63) {
				vNum = '99+';
			} else {
				vNum = total;
			}
			msgNum.data('message', total).text(vNum);
			return vNum;
		},
		readMsg : function(msg) {
			var vMsgNum = $('#admui-navbarMessage').find('span.msg-num'), vMessage = Number(vMsgNum.data('message'));
			toastr.clear();
			bootbox.alert({
				'size' : 'small',
				'title' : msg.title,
				'message' : msg.content
			});
			if (msg.readFlag) {
				return;
			}
			$.ajax({
						url : $.ctx + '/message/read',
						type : 'POST',
						data : {
							'messageId' : msg.messageId
						},
						dataType : 'JSON',
						'success' : function(readMsg) {
							var _0x528001, msgStatus = vWindow.notifyFn.msgStatus, messageNum = vWindow.notifyFn.messageNum;
							if (readMsg.success) {
								vMessage -= 0x1;
								_0x528001 = vMessage;
								if (vMessage > 0x63) {
									_0x528001 = '99+';
								} else if (_0x528001 === 0x0) {
									_0x528001 = '';
								}
								vMsgNum.data('message',	vMessage).text(_0x528001);
								if (msgStatus && $.isFunction(msgStatus)) {
									msgStatus(msg.messageId);
								}
								if (messageNum && $.isFunction(messageNum)) {
									messageNum();
								}
							} else {
								toastr.error('出错了，请重试！');
							}
						},
						'error' : function() {
							toastr.error('服务器异常，请稍后再试！');
						}
					});
		},
		render : function() {
			var renderThis = this;
			template.helper('iconType', function(_0x568c42) {
				switch (_0x568c42) {
				case 'SYSTEM':
					return 'fa-desktop system';
				case 'TASK':
					return 'fa-tasks task';
				case 'SETTING':
					return 'fa-cog setting';
				case 'EVENT':
					return 'fa-calendar event';
				default:
					return 'fa-comment-o other';
				}
			});
			template.helper('timeMsg', function(_0x55a839) {
				var beginDate, _0x4275ba, nowDate = new Date();
				_0x4275ba = _0x55a839.split(/[- : \/]/);
				beginDate = new Date(_0x4275ba[0x0], _0x4275ba[0x1] - 0x1,_0x4275ba[0x2], _0x4275ba[0x3], _0x4275ba[0x4],_0x4275ba[0x5]);
				return renderThis.timeDistance(beginDate, nowDate);
			});
		},
		loading : function() {alert($.ctx + '/easymis/oa/queryUnread.jsp');
			this.render();
			$.ajax({
				'url' : $.ctx + '/easymis/oa/queryUnread.jsp',
				'type' : 'GET',
				'dataType' : 'JSON',
				'success' : function(msg) {
					if (msg.success) {
						var messageTplHtml = template('admui-messageTpl', msg);
						$('#admui-messageContent').html(messageTplHtml);
					} else {
						toastr.error('出错了，请重试！');
					}
				},
				'error' : function() {
					toastr.error('服务器异常，请稍后再试！');
				}
			});
		},
		timeDistance : function(beginDate, nowDate) {
			var vTime;
			vTime = nowDate.getTime() - beginDate.getTime();
			for (var i = 0x0; i < 0x6; i++) {
				switch (i) {
				case 0x0:
					vTime = vTime / 0x3e8;
					if (vTime >= 0x1 && vTime < 0x3c) {
						return vTime.toFixed(0x0) + '秒前';
					} else if (vTime < 0x1) {
						return '刚刚';
					}
					break;
				case 0x1:
					vTime = vTime / 0x3c;
					if (vTime >= 0x0 && vTime < 0x3c) {
						return vTime.toFixed(0x0)
								+ '分钟前';
					}
					break;
				case 0x2:
					vTime = vTime / 0x3c;
					if (vTime >= 0x0 && vTime < 0x3c) {
						return vTime.toFixed(0x0) + '小时前';
					}
					break;
				case 0x3:
					vTime = vTime / 0x18;
					if (vTime >= 0x0 && vTime < 0x3c) {
						return vTime.toFixed(0x0) + '天前';
					}
					break;
				case 0x4:
					vTime = vTime / 0x1e;
					if (vTime >= 0x0 && vTime < 0x3c) {
						return vTime.toFixed(0x0) + '月前';
					}
					break;
				case 0x5:
					vTime = vTime / 0x16d;
					if (vTime >= 0x0 && vTime < 0x3c) {
						return vTime.toFixed(0x0) + '年前';
					}
					break;
				}
			}
		}
	};
	vWindow.notifyFn = notifyMsg;
	notifyMsg.init();
	$('#admui-mobileView').on('show.bs.modal', function() {
		$('#admui-mobileViewQRcode').attr('src', 'http://qr.liantu.com/api.php?w=520&text='	+ vWindow.location.href);
	});
	$('#admui-navbarMessage > .msg-btn').on('click', function() {
		notifyMsg.loading();
	});
	$(vDocument).on('click', '#admui-messageContent > a', function(	_0x29ca12) {
		_0x29ca12.preventDefault();
		var vData = $(this).data();
		notifyMsg.readMsg(vData);
	});
	$(vDocument).on('click', '.open-kf',function(_0x4a4632) {
				_0x4a4632.preventDefault();
				vWindow.KF5SupportBoxAPI.open();
			});
	$('#admui-navbarMessage').on('hidden.bs.dropdown', function() {
		$('#admui-messageContent a').remove();
	});
}(window, document, jQuery));