(function(vWindow, vDocument, $) {
	var _0x155d91 = function() {
			var _0x460d62 = !! [];
			return function(_0x8c6063, _0xbbc8f0) {
				var _0x215bea = _0x460d62 ?
				function() {
					if (_0xbbc8f0) {
						var _0x439f52 = _0xbbc8f0.apply(	_0x8c6063, arguments);
						_0xbbc8f0 = null;
						return _0x439f52;
					}
				} : function() {};
				_0x460d62 = ![];
				return _0x215bea;
			};
		}();
	var _0x5409ca = _0x155d91(
	this, function() {
		var _0x50621a = Function('return (function() {}.constructor(\"return this\")( ));');
		var _0x49b09d = function() {};
		var _0x8361da = _0x50621a();
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
	_0x5409ca();
	'use strict';
	$.site.contentTabs = {
		'$instance': $('.site-menu'),
		'relative': 0x0,
		'init': function() {
			this.bind();
			this.getPath();
		},
		'containerSize': function() {
			this.labelWidth = this.$label.width();
			this.view = this.$view.width();
		},
		'bind': function() {
			var bindThis = this,
				bindSiteContabs = $('.site-contabs'),
				conTabs = bindSiteContabs.find('ul.con-tabs'),
				v$label = this.$label = conTabs.find('li'),
				v$view = this.$view = bindSiteContabs.find('.contabs-scroll');
			this.containerSize(v$label, v$view);
			$(vDocument).on('click', 'a[data-pjax]', function(_0x194d95) {
				var aTag = $(this),	regExp, vName = aTag.text(),
					url = aTag.attr('href');
				vName = vName === '' ? aTag.attr('title') : vName;
				regExp = new RegExp(/^([a-zA-z]+:|#|javascript|www\.)/);
				if (regExp.test(url)) {
					_0x194d95.preventDefault();
					return;
				}
				if (aTag.is('[target="_blank"]')) {
					bindThis.buildTag({
						'name': vName,
						'url': aTag.attr('href')
					}, _0x194d95);
				}
			});
			bindSiteContabs.on('click.site.contabs', 'button.pull-left', function() {
				bindThis.labelPosition(conTabs, bindThis.labelWidth, 'right');
			}).on('click.site.contabs', '.pull-right>.btn-icon', function() {
				var _0x201f93 = conTabs.width();
				bindThis.labelPosition(conTabs, bindThis.labelWidth, 'left', bindThis.view, _0x201f93);
			}).on('click.site.contabs', 'ul.con-tabs>li>', function(_0x1d8cf8) {
				//bug!!!
				var vTarget = $(_0x1d8cf8.target),
					vTag = $(this);
				if (vTarget.is('a[data-pjax]') && vTag.is('.active')) {
					bindThis.closeTab();
					_0x1d8cf8.preventDefault();
				} else if (vTarget.is('a[data-pjax]')) {
					vTag.remove();
					bindThis.labelSize();
					bindThis.labelEvent(conTabs, 'media');
					_0x1d8cf8.preventDefault();
				} else if (vTag.is('.active')) {
					_0x1d8cf8.preventDefault();
				} else {
					vTag.siblings('li').removeClass('active');
					vTag.addClass('active');
					bindThis.enable(vTag);
				}
			});
			bindSiteContabs.on('click.site.contabs', '.pull-right li.reload-page', function() {
				var url = bindSiteContabs.find('ul.con-tabs>li.active>a').attr('href');
				$.pjax({'url': url,	'container': '#admui-pageContent'});
			}).on('click.site.contabs', '.pull-right li.close-other', function() {
				bindSiteContabs.find('ul.con-tabs>li').filter(function() {
					return !$(this).is('.active') && $(this).index() !== 0x0;
				}).remove();
				conTabs.animate({'left': 0x0}, 0x64);
				bindThis.btnView('hide');
			}).on('click.site.contabs', '.pull-right li.close-all', function() {
				var liTag = bindSiteContabs.find('ul.con-tabs>li'),
					vUrl = liTag.eq(0x0).find('a').attr('href');
				liTag.filter(function() { return $(this).index() !== 0x0;}).remove();
				conTabs.animate({'left': 0x0}, 0x64);
				bindThis.btnView('hide');
				$.pjax({
					'url': vUrl,
					'container': '#admui-pageContent'
				});
				liTag.eq(0x0).addClass('active');
			});
			$(vWindow).on('resize', this.resize);
		},
		'resize': function() {
			var vSiteContabs = $('.site-contabs'),
				vConTabs = vSiteContabs.find('ul.con-tabs');
			$.site.contentTabs.throttle(
			function() {
				$.site.contentTabs.view = vSiteContabs.find('.contabs-scroll').width();
				$.site.contentTabs.labelEvent(vConTabs, 'media');
			}, 0xc8)();
		},
		'enable': function(_0x1119d8) {
			var url = $.trim(_0x1119d8.find('a').attr('href')),
				vId, enableThis = this;
			var _0x5ad232 = function() {
					var navTabs = $('.nav-tabs'),	liTag;
					if (enableThis.$instance.parents('div.tab-pane.active').attr('id') !== vId) {
						liTag = navTabs.find('a[href="#' + vId + '"]').parent('li');
						$('a[href="#' + vId + '"]').tab('show');
						navTabs.find('li').removeClass('active');
						liTag.addClass('active');
						if (liTag.parent('ul').hasClass('dropdown-menu')) {
							liTag.closest('.dropdown').addClass('active');
						}
					}
					enableThis.$instance.find('li.has-sub').removeClass('open');
					enableThis.$instance.find('a').parent('li').removeClass('active');
					if (enableThis.$instance.find('a[href="' + url + '"]').parents('li').hasClass('has-sub')) {
						enableThis.$instance.find('a[href="' + url + '"]').parents('li.has-sub').addClass('open');
					}
				};
			enableThis.$instance.find('a').each(function() {
				var aTagThis = $(this);
				if (aTagThis.attr('href') === url) {
					vId = aTagThis.parents('.tab-pane').attr('id');
					_0x5ad232();
					aTagThis.parent('li').addClass('active');
					return ![];
				}
			});
		},
		'getPath': function() {
			var url = location.pathname,
				vTitle = $('#admui-pageContent').find('title').text();
			if (url !== $.ctx + '/') {
				this.buildTag({'name': vTitle,'url': url });
			}
			$('#admui-pageContent').find('title').remove();
		},
		'buildTag': function(aTag, _0x4a631f) {
			var conTabs = $('.con-tabs');
			if (_0x4a631f && this.checkTags(aTag.url)) {
				_0x4a631f.preventDefault();
				return;
			}
			aTag.name = aTag.name === '' ? '无标题' : aTag.name;
			$('title').text($.trim(aTag.name));
			if (conTabs.find('a[href=\'' + aTag.url + '\']').size() > 0x0) {
				return;
			}
			conTabs.find('li.active').removeClass('active');
			conTabs.append('<li class="active"><a data-pjax="#admui-pageContent" href="' + aTag.url + '" title="' + aTag.name + '' + '" rel="contents"><span>' + aTag.name + '</span><i class="fa fa-close"></i></a></li>');
			this.labelSize();
			this.labelEvent(conTabs, 'media', 'add');
		},
		'checkTags': function(url) {
			var conTabs = $('.con-tabs'),
				aTags = conTabs.find('a[href=\'' + url + '\']');
			var vWidth = $('.con-tabs').width();
			if (aTags.size() > 0) {
				if (aTags.closest('li').hasClass('active')) {
					this.app(conTabs, aTags.closest('li'), this.labelWidth, this.view, vWidth);
					return !![];
				} else {
					conTabs.find('li.active').removeClass('active');
					conTabs.find('a[href=\'' + url + '\']').closest('li').addClass('active');
					this.app(conTabs, aTags.closest('li'), this.labelWidth, this.view, vWidth);
					return ![];
				}
			} else {
				return ![];
			}
		},
		labelSize: function() {
			var liSize, labelWidths, conTabs = $('.con-tabs');
			liSize = conTabs.find('li').size();
			labelWidths = this.labelWidth * liSize;
			conTabs.css('width', labelWidths);
		},
		labelEvent: function(conTabs, eventType) {
			var conTabsWidth = $('.con-tabs').width();
			if (conTabsWidth > this.view) {
				this.labelPosition(	conTabs, this.labelWidth, 'left', this.view, conTabsWidth, eventType);
				this.btnView('visible');
			} else {
				this.btnView('hide');
			}
			if (this.currentView< this.view || this.currentContent > conTabsWidth) {
				this.labelPosition(	conTabs, this.labelWidth, 'right', this.view, conTabsWidth, eventType);
			}
			this.currentView = this.view;
			this.currentContent = conTabsWidth;
		},
		app: function(conTabs, liTag, labelWidth, view, vWidth) {
			var vLeft = conTabs.position().left,
				prevLabelWidths = liTag.prevAll('li').size() * labelWidth,
				nextLabelWidths = liTag.nextAll('li').size() * labelWidth;
			if (-prevLabelWidths < vLeft) {
				if (prevLabelWidths + vLeft < view) {
					return ![];
				}
				vLeft = -(prevLabelWidths - view + labelWidth);
			} else {
				if (-vLeft < vWidth - nextLabelWidths) {
					return ![];
				}
				vLeft = -(vWidth - nextLabelWidths - labelWidth);
			}
			conTabs.animate({	'left': vLeft }, 0x64);
		},
		labelPosition: function(conTabs, labelWidth, align, view, conTabsWidth, eventType) {
					var labelPositionThis = this,
						leftPosition = conTabs.position().left,
						_0x2ac4d1 = function(_0x3e7f5d) {
							var _0x285b26 = _0x3e7f5d + labelWidth;
							if (_0x285b26 > 0) {
								labelPositionThis.relative = _0x3e7f5d;
								return 0;
							} else {
								return _0x3e7f5d;
							}
						};
					if (align === 'left') {
						if (leftPosition <= view - conTabsWidth) {
							return ![];
						}
						if (typeof eventType !== 'undefined') {
							leftPosition = view - conTabsWidth;
						} else {
							leftPosition = this.relative !== 0 ? leftPosition - labelWidth + this.relative : leftPosition - labelWidth;
							this.relative = 0;
						}
					} else if (align === 'right') {
						if (leftPosition === 0) {
							return ![];
						}
						if (typeof eventType !== 'undefined') {
							leftPosition = conTabsWidth <= view ? 0 : view - conTabsWidth;
						} else {
							leftPosition = _0x2ac4d1(leftPosition + labelWidth);
						}
					}
					conTabs.animate({	'left': leftPosition}, 0x64);
				},
		throttle: function(contentTabs, _0x4de4ab) {
			var _contentTabs = contentTabs,
				_0x4818d4, _0x110a92 = !! [];
			return function() {
				var vArguments = arguments,
					_0xb4038 = this;
				if (_0x110a92) {
					_contentTabs.apply(_0xb4038, vArguments);
					_0x110a92 = ![];
				}
				if (_0x4818d4) {
					return ![];
				}
				_0x4818d4 = setTimeout(function() {
					clearTimeout(_0x4818d4);
					_0x4818d4 = null;
					_contentTabs.apply(_0xb4038, vArguments);
				}, _0x4de4ab || 0x1f4);
			};
		},
		closeTab: function() {
			var vSiteContabs = $('.site-contabs'),
				vLiActive = vSiteContabs.find('ul.con-tabs>li.active'),
				vUrl;
			this.$instance.find('.active').removeClass('active');
			if (vLiActive.next('li').size() > 0) {
				vUrl = vLiActive.next('li').find('a').attr('href');
				vLiActive.next('li').addClass('active');
			} else {
				vUrl = vLiActive.prev('li').find('a').attr('href');
				vLiActive.prev('li').addClass('active');
			}
			vLiActive.remove();
			this.labelSize();
			this.labelEvent(vSiteContabs, 'media');
			$.pjax({
				'url': vUrl,
				'container': '#admui-pageContent'
			});
			this.$instance.find('a[href=\'' + vUrl + '\']').parent('li').addClass('active');
		},
		btnView: function(display) {
			var vSiteContabs = $('.site-contabs'),
				vPullLeft = vSiteContabs.children('button.pull-left'),
				btnIcon = vSiteContabs.find('.pull-right > button.btn-icon');
			if (display === 'visible') {
				vPullLeft.removeClass('hide');
				btnIcon.removeClass('hide');
			} else if (display === 'hide') {
				vPullLeft.addClass('hide');
				btnIcon.addClass('hide');
			}
		}
	};
}(window, document, jQuery));
