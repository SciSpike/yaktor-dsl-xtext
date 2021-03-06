package io.yaktor.generator.util

class MiscStaticFiles {
	def genNodeMonCommand() {
		'''
			nodemon -i "index.adoc" -e ".adoc" --exec ruby buildAll.rb
		'''
	}

	def genDocumentationCss() {
		'''
			/* Derived from the Riak documentation theme developed by Basho Technologies, Inc. | CC BY 3.0 License | http://docs.basho.org */
			@import url(http://fonts.googleapis.com/css?family=Titillium+Web:400,700);
			 @import url(http://fonts.googleapis.com/css?family=Noticia+Text:400,400italic);
			 /*! normalize.css v2.1.2 | MIT License | git.io/normalize */
			 /* ========================================================================== HTML5 display definitions ========================================================================== */
			 /** Correct `block` display not defined in IE 8/9. */
			 @import url(http://cdnjs.cloudflare.com/ajax/libs/font-awesome/3.2.1/css/font-awesome.css);
			 article, aside, details, figcaption, figure, footer, header, hgroup, main, nav, section, summary { display: block; }

			 /** Correct `inline-block` display not defined in IE 8/9. */
			 audio, canvas, video { display: inline-block; }

			 /** Prevent modern browsers from displaying `audio` without controls. Remove excess height in iOS 5 devices. */
			 audio:not([controls]) { display: none; height: 0; }

			 /** Address `[hidden]` styling not present in IE 8/9. Hide the `template` element in IE, Safari, and Firefox < 22. */
			 [hidden], template { display: none; }

			 script { display: none !important; }

			 /* ========================================================================== Base ========================================================================== */
			 /** 1. Set default font family to sans-serif. 2. Prevent iOS text size adjust after orientation change, without disabling user zoom. */
			 html { font-family: sans-serif; /* 1 */ -ms-text-size-adjust: 100%; /* 2 */ -webkit-text-size-adjust: 100%; /* 2 */ }

			 /** Remove default margin. */
			 body { margin: 0; }

			 /* ========================================================================== Links ========================================================================== */
			 /** Remove the gray background color from active links in IE 10. */
			 a { background: transparent; }

			 /** Address `outline` inconsistency between Chrome and other browsers. */
			 a:focus { outline: thin dotted; }

			 /** Improve readability when focused and also mouse hovered in all browsers. */
			 a:active, a:hover { outline: 0; }

			 /* ========================================================================== Typography ========================================================================== */
			 /** Address variable `h1` font-size and margin within `section` and `article` contexts in Firefox 4+, Safari 5, and Chrome. */
			 h1 { font-size: 2em; margin: 0.67em 0; }

			 /** Address styling not present in IE 8/9, Safari 5, and Chrome. */
			 abbr[title] { border-bottom: 1px dotted; }

			 /** Address style set to `bolder` in Firefox 4+, Safari 5, and Chrome. */
			 b, strong { font-weight: bold; }

			 /** Address styling not present in Safari 5 and Chrome. */
			 dfn { font-style: italic; }

			 /** Address differences between Firefox and other browsers. */
			 hr { -moz-box-sizing: content-box; box-sizing: content-box; height: 0; }

			 /** Address styling not present in IE 8/9. */
			 mark { background: #ff0; color: #000; }

			 /** Correct font family set oddly in Safari 5 and Chrome. */
			 code, kbd, pre, samp { font-family: monospace, serif; font-size: 1em; }

			 /** Improve readability of pre-formatted text in all browsers. */
			 pre { white-space: pre-wrap; }

			 /** Set consistent quote types. */
			 q { quotes: "\201C" "\201D" "\2018" "\2019"; }

			 /** Address inconsistent and variable font size in all browsers. */
			 small { font-size: 80%; }

			 /** Prevent `sub` and `sup` affecting `line-height` in all browsers. */
			 sub, sup { font-size: 75%; line-height: 0; position: relative; vertical-align: baseline; }

			 sup { top: -0.5em; }

			 sub { bottom: -0.25em; }

			 /* ========================================================================== Embedded content ========================================================================== */
			 /** Remove border when inside `a` element in IE 8/9. */
			 img { border: 0; }

			 /** Correct overflow displayed oddly in IE 9. */
			 svg:not(:root) { overflow: hidden; }

			 /* ========================================================================== Figures ========================================================================== */
			 /** Address margin not present in IE 8/9 and Safari 5. */
			 figure { margin: 0; }

			 /* ========================================================================== Forms ========================================================================== */
			 /** Define consistent border, margin, and padding. */
			 fieldset { border: 1px solid #c0c0c0; margin: 0 2px; padding: 0.35em 0.625em 0.75em; }

			 /** 1. Correct `color` not being inherited in IE 8/9. 2. Remove padding so people aren't caught out if they zero out fieldsets. */
			 legend { border: 0; /* 1 */ padding: 0; /* 2 */ }

			 /** 1. Correct font family not being inherited in all browsers. 2. Correct font size not being inherited in all browsers. 3. Address margins set differently in Firefox 4+, Safari 5, and Chrome. */
			 button, input, select, textarea { font-family: inherit; /* 1 */ font-size: 100%; /* 2 */ margin: 0; /* 3 */ }

			 /** Address Firefox 4+ setting `line-height` on `input` using `!important` in the UA stylesheet. */
			 button, input { line-height: normal; }

			 /** Address inconsistent `text-transform` inheritance for `button` and `select`. All other form control elements do not inherit `text-transform` values. Correct `button` style inheritance in Chrome, Safari 5+, and IE 8+. Correct `select` style inheritance in Firefox 4+ and Opera. */
			 button, select { text-transform: none; }

			 /** 1. Avoid the WebKit bug in Android 4.0.* where (2) destroys native `audio` and `video` controls. 2. Correct inability to style clickable `input` types in iOS. 3. Improve usability and consistency of cursor style between image-type `input` and others. */
			 button, html input[type="button"], input[type="reset"], input[type="submit"] { -webkit-appearance: button; /* 2 */ cursor: pointer; /* 3 */ }

			 /** Re-set default cursor for disabled elements. */
			 button[disabled], html input[disabled] { cursor: default; }

			 /** 1. Address box sizing set to `content-box` in IE 8/9. 2. Remove excess padding in IE 8/9. */
			 input[type="checkbox"], input[type="radio"] { box-sizing: border-box; /* 1 */ padding: 0; /* 2 */ }

			 /** 1. Address `appearance` set to `searchfield` in Safari 5 and Chrome. 2. Address `box-sizing` set to `border-box` in Safari 5 and Chrome (include `-moz` to future-proof). */
			 input[type="search"] { -webkit-appearance: textfield; /* 1 */ -moz-box-sizing: content-box; -webkit-box-sizing: content-box; /* 2 */ box-sizing: content-box; }

			 /** Remove inner padding and search cancel button in Safari 5 and Chrome on OS X. */
			 input[type="search"]::-webkit-search-cancel-button, input[type="search"]::-webkit-search-decoration { -webkit-appearance: none; }

			 /** Remove inner padding and border in Firefox 4+. */
			 button::-moz-focus-inner, input::-moz-focus-inner { border: 0; padding: 0; }

			 /** 1. Remove default vertical scrollbar in IE 8/9. 2. Improve readability and alignment in all browsers. */
			 textarea { overflow: auto; /* 1 */ vertical-align: top; /* 2 */ }

			 /* ========================================================================== Tables ========================================================================== */
			 /** Remove most spacing between table cells. */
			 table { border-collapse: collapse; border-spacing: 0; }

			 meta.foundation-mq-small { font-family: "only screen and (min-width: 768px)"; width: 768px; }

			 meta.foundation-mq-medium { font-family: "only screen and (min-width:1280px)"; width: 1280px; }

			 meta.foundation-mq-large { font-family: "only screen and (min-width:1440px)"; width: 1440px; }

			 *, *:before, *:after { -moz-box-sizing: border-box; -webkit-box-sizing: border-box; box-sizing: border-box; }

			 html, body { font-size: 100%; }

			 body { background: white; color: #222222; padding: 0; margin: 0; font-family: "Helvetica Neue", "Helvetica", Helvetica, Arial, sans-serif; font-weight: normal; font-style: normal; line-height: 1; position: relative; cursor: auto; }

			 a:hover { cursor: pointer; }

			 img, object, embed { max-width: 100%; height: auto; }

			 object, embed { height: 100%; }

			 img { -ms-interpolation-mode: bicubic; }

			 #map_canvas img, #map_canvas embed, #map_canvas object, .map_canvas img, .map_canvas embed, .map_canvas object { max-width: none !important; }

			 .left { float: left !important; }

			 .right { float: right !important; }

			 .text-left { text-align: left !important; }

			 .text-right { text-align: right !important; }

			 .text-center { text-align: center !important; }

			 .text-justify { text-align: justify !important; }

			 .hide { display: none; }

			 .antialiased, body { -webkit-font-smoothing: antialiased; }

			 img { display: inline-block; vertical-align: middle; }

			 textarea { height: auto; min-height: 50px; }

			 select { width: 100%; }

			 p.lead, .paragraph.lead > p, #preamble > .sectionbody > .paragraph:first-of-type p { font-size: 1.21875em; line-height: 1.6; }

			 .subheader, #content #toctitle, .admonitionblock td.content > .title, .exampleblock > .title, .imageblock > .title, .listingblock > .title, .literalblock > .title, .mathblock > .title, .openblock > .title, .paragraph > .title, .quoteblock > .title, .sidebarblock > .title, .tableblock > .title, .verseblock > .title, .videoblock > .title, .dlist > .title, .olist > .title, .ulist > .title, .qlist > .title, .hdlist > .title, .tableblock > caption { line-height: 1.4; color: #3c3d3f; font-weight: 300; margin-top: 0.2em; margin-bottom: 0.5em; }

			 /* Typography resets */
			 div, dl, dt, dd, ul, ol, li, h1, h2, h3, #toctitle, .sidebarblock > .content > .title, h4, h5, h6, pre, form, p, blockquote, th, td { margin: 0; padding: 0; direction: ltr; }

			 /* Default Link Styles */
			 a { color: #2984a9; text-decoration: underline; line-height: inherit; }
			 a:hover, a:focus { color: #faa94c; }
			 a img { border: none; }

			 /* Default paragraph styles */
			 p { font-family: inherit; font-weight: normal; font-size: 1em; line-height: 1.5; margin-bottom: 0.9375em; text-rendering: geometricPrecision; }
			 p aside { font-size: 0.875em; line-height: 1.35; font-style: italic; }

			 /* Default header styles */
			 h1, h2, h3, #toctitle, .sidebarblock > .content > .title, h4, h5, h6 { font-family: "Titillium Web", Verdana, Arial, sans-serif; font-weight: normal; font-style: normal; color: #616366; text-rendering: geometricPrecision; margin-top: 0.5em; margin-bottom: 0.5em; line-height: 1.2125em; }
			 h1 small, h2 small, h3 small, #toctitle small, .sidebarblock > .content > .title small, h4 small, h5 small, h6 small { font-size: 60%; color: #aeb0b2; line-height: 0; }

			 h1 { font-size: 2.125em; }

			 h2 { font-size: 1.6875em; }

			 h3, #toctitle, .sidebarblock > .content > .title { font-size: 1.375em; }

			 h4 { font-size: 1.125em; }

			 h5 { font-size: 1.125em; }

			 h6 { font-size: 1em; }

			 hr { border: solid #dddddd; border-width: 1px 0 0; clear: both; margin: 1.25em 0 1.1875em; height: 0; }

			 /* Helpful Typography Defaults */
			 em, i { font-style: italic; line-height: inherit; }

			 strong, b { font-weight: bold; line-height: inherit; }

			 small { font-size: 60%; line-height: inherit; }

			 code { font-family: monospace, serif; font-weight: normal; color: #515151; }

			 /* Lists */
			 ul, ol, dl { font-size: 1em; line-height: 1.5; margin-bottom: 0.9375em; list-style-position: outside; font-family: inherit; }

			 ul, ol { margin-left: 1.5em; }
			 ul.no-bullet, ol.no-bullet { margin-left: 1.5em; }

			 /* Unordered Lists */
			 ul li ul, ul li ol { margin-left: 1.25em; margin-bottom: 0; font-size: 1em; /* Override nested font-size change */ }
			 ul.square li ul, ul.circle li ul, ul.disc li ul { list-style: inherit; }
			 ul.square { list-style-type: square; }
			 ul.circle { list-style-type: circle; }
			 ul.disc { list-style-type: disc; }
			 ul.no-bullet { list-style: none; }

			 /* Ordered Lists */
			 ol li ul, ol li ol { margin-left: 1.25em; margin-bottom: 0; }

			 /* Definition Lists */
			 dl dt { margin-bottom: 0.3125em; font-weight: bold; }
			 dl dd { margin-bottom: 1.25em; }

			 /* Abbreviations */
			 abbr, acronym { text-transform: uppercase; font-size: 90%; color: #515151; border-bottom: 1px dotted #dddddd; cursor: help; }

			 abbr { text-transform: none; }

			 /* Blockquotes */
			 blockquote { margin: 0 0 0.9375em; padding: 0.5625em 1.25em 0 1.1875em; border-left: 1px solid #dddddd; }
			 blockquote cite { display: block; font-size: inherit; color: #484a4c; }
			 blockquote cite:before { content: "\2014 \0020"; }
			 blockquote cite a, blockquote cite a:visited { color: #484a4c; }

			 blockquote, blockquote p { line-height: 1.5; color: #616366; }

			 /* Microformats */
			 .vcard { display: inline-block; margin: 0 0 1.25em 0; border: 1px solid #dddddd; padding: 0.625em 0.75em; }
			 .vcard li { margin: 0; display: block; }
			 .vcard .fn { font-weight: bold; font-size: 0.9375em; }

			 .vevent .summary { font-weight: bold; }
			 .vevent abbr { cursor: auto; text-decoration: none; font-weight: bold; border: none; padding: 0 0.0625em; }

			 @media only screen and (min-width: 768px) { h1, h2, h3, #toctitle, .sidebarblock > .content > .title, h4, h5, h6 { line-height: 1.4; }
			   h1 { font-size: 2.75em; }
			   h2 { font-size: 2.3125em; }
			   h3, #toctitle, .sidebarblock > .content > .title { font-size: 1.6875em; }
			   h4 { font-size: 1.4375em; } }
			 /* Print styles.  Inlined to avoid required HTTP connection: www.phpied.com/delay-loading-your-print-css/ Credit to Paul Irish and HTML5 Boilerplate (html5boilerplate.com)
			 */
			 .print-only { display: none !important; }

			 @media print { * { background: transparent !important; color: #000 !important; /* Black prints faster: h5bp.com/s */ box-shadow: none !important; text-shadow: none !important; }
			   a, a:visited { text-decoration: underline; }
			   a[href]:after { content: " (" attr(href) ")"; }
			   abbr[title]:after { content: " (" attr(title) ")"; }
			   .ir a:after, a[href^="javascript:"]:after, a[href^="#"]:after { content: ""; }
			   pre, blockquote { border: 1px solid #999; page-break-inside: avoid; }
			   thead { display: table-header-group; /* h5bp.com/t */ }
			   tr, img { page-break-inside: avoid; }
			   img { max-width: 100% !important; }
			   @page { margin: 0.5cm; }
			   p, h2, h3, #toctitle, .sidebarblock > .content > .title { orphans: 3; widows: 3; }
			   h2, h3, #toctitle, .sidebarblock > .content > .title { page-break-after: avoid; }
			   .hide-on-print { display: none !important; }
			   .print-only { display: block !important; }
			   .hide-for-print { display: none !important; }
			   .show-for-print { display: inherit !important; } }
			 /* Tables */
			 table { background: #f1f1f1; margin-bottom: 1.25em; border: solid 5px white; }
			 table thead, table tfoot { background: #dfdfdf; font-weight: bold; }
			 table thead tr th, table thead tr td, table tfoot tr th, table tfoot tr td { padding: 0.5em 0.625em 0.625em; font-size: inherit; color: #222222; text-align: left; }
			 table tr th, table tr td { padding: 0.5625em 0.625em; font-size: inherit; color: #222222; }
			 table tr.even, table tr.alt, table tr:nth-of-type(even) { background: #dfdfdf; }
			 table thead tr th, table tfoot tr th, table tbody tr td, table tr td, table tfoot tr td { display: table-cell; line-height: 1.5; }

			 .clearfix:before, .clearfix:after, .float-group:before, .float-group:after { content: " "; display: table; }
			 .clearfix:after, .float-group:after { clear: both; }

			 *:not(pre) > code { font-size: 0.9em; padding: 0 3px; white-space: nowrap; background-color: #dfdfdf; border: 1px solid #c9c9c9; -webkit-border-radius: 4px; border-radius: 4px; text-shadow: none; }

			 pre, pre > code { line-height: 1.6; color: inherit; font-family: monospace, serif; font-weight: normal; }

			 .keyseq { color: #848484; }

			 kbd:not(.keyseq) { display: inline-block; color: #515151; font-size: 0.75em; line-height: 1.4; background-color: #F7F7F7; border: 1px solid #ccc; -webkit-border-radius: 3px; border-radius: 3px; -webkit-box-shadow: 0 1px 0 rgba(0, 0, 0, 0.2), 0 0 0 2px white inset; box-shadow: 0 1px 0 rgba(0, 0, 0, 0.2), 0 0 0 2px white inset; margin: -0.15em 0.15em 0 0.15em; padding: 0.2em 0.6em 0.2em 0.5em; vertical-align: middle; white-space: nowrap; }

			 .keyseq kbd:first-child { margin-left: 0; }

			 .keyseq kbd:last-child { margin-right: 0; }

			 .menuseq, .menu { color: #373737; }

			 b.button:before, b.button:after { position: relative; top: -1px; font-weight: normal; }

			 b.button:before { content: "["; padding: 0 3px 0 2px; }

			 b.button:after { content: "]"; padding: 0 2px 0 3px; }

			 p a > code:hover { color: #444444; }

			 #header, #content, #footnotes, #footer { width: 100%; margin-left: auto; margin-right: auto; margin-top: 0; margin-bottom: 0; max-width: 62.5em; *zoom: 1; position: relative; padding-left: 0.9375em; padding-right: 0.9375em; }
			 #header:before, #header:after, #content:before, #content:after, #footnotes:before, #footnotes:after, #footer:before, #footer:after { content: " "; display: table; }
			 #header:after, #content:after, #footnotes:after, #footer:after { clear: both; }

			 #header { margin-bottom: 2.5em; }
			 #header > h1 { color: #616366; font-weight: normal; border-bottom: 1px solid #dddddd; margin-bottom: -28px; padding-bottom: 32px; }
			 #header span { color: #616366; }
			 #header #revnumber { text-transform: capitalize; }
			 #header br { display: none; }
			 #header br + span { padding-left: 3px; }
			 #header br + span:before { content: "\2013 \0020"; }
			 #header br + span.author { padding-left: 0; }
			 #header br + span.author:before { content: ", "; }

			 #toc { border-bottom: 1px dashed #cccccc; padding-bottom: 1.25em; }
			 #toc > ul { margin-left: 0.25em; }
			 #toc ul.sectlevel0 > li > a { font-style: italic; }
			 #toc ul.sectlevel0 ul.sectlevel1 { margin-left: 0; margin-top: 0.5em; margin-bottom: 0.5em; }
			 #toc ul { list-style-type: none; }

			 #toctitle { color: #3c3d3f; }

			 @media only screen and (min-width: 768px) { body.toc2 { padding-left: 15em; padding-right: 0; }
			   #toc.toc2 { position: fixed; width: 15em; left: 0; top: 0; border-right: 1px solid #cccccc; border-bottom: 0; z-index: 1000; padding: 1em; height: 100%; overflow: auto; }
			   #toc.toc2 #toctitle { margin-top: 0; font-size: 1.2em; }
			   #toc.toc2 > ul { font-size: .90em; }
			   #toc.toc2 ul ul { margin-left: 0; padding-left: 1em; }
			   #toc.toc2 ul.sectlevel0 ul.sectlevel1 { padding-left: 0; margin-top: 0.5em; margin-bottom: 0.5em; }
			   body.toc2.toc-right { padding-left: 0; padding-right: 15em; }
			   body.toc2.toc-right #toc.toc2 { border-right: 0; border-left: 1px solid #cccccc; left: auto; right: 0; } }
			 @media only screen and (min-width: 1280px) { body.toc2 { padding-left: 20em; padding-right: 0; }
			   #toc.toc2 { width: 20em; }
			   #toc.toc2 #toctitle { font-size: 1.375em; }
			   #toc.toc2 > ul { font-size: 0.95em; }
			   #toc.toc2 ul ul { padding-left: 1.25em; }
			   body.toc2.toc-right { padding-left: 0; padding-right: 20em; } }
			 #content #toc { border-style: solid; border-width: 1px; border-color: #d9d9d9; margin-bottom: 1.25em; padding: 1.25em; background: #f2f2f2; border-width: 0; -webkit-border-radius: 4px; border-radius: 4px; }
			 #content #toc > :first-child { margin-top: 0; }
			 #content #toc > :last-child { margin-bottom: 0; }
			 #content #toc a { text-decoration: none; }

			 #content #toctitle { font-weight: bold; font-family: "Titillium Web", Verdana, Arial, sans-serif; font-size: 1em; padding-left: 0.125em; }

			 #footer { max-width: 100%; background-color: #515151; padding: 1.25em; }

			 #footer-text { color: #aeaeae; line-height: 1.35; }

			 .sect1 { padding-bottom: 1.25em; }

			 .sect1 + .sect1 { border-top: 1px dashed #cccccc; }

			 #content h1 > a.anchor, h2 > a.anchor, h3 > a.anchor, #toctitle > a.anchor, .sidebarblock > .content > .title > a.anchor, h4 > a.anchor, h5 > a.anchor, h6 > a.anchor { position: absolute; width: 1em; margin-left: -1em; display: block; text-decoration: none; visibility: hidden; text-align: center; font-weight: normal; }
			 #content h1 > a.anchor:before, h2 > a.anchor:before, h3 > a.anchor:before, #toctitle > a.anchor:before, .sidebarblock > .content > .title > a.anchor:before, h4 > a.anchor:before, h5 > a.anchor:before, h6 > a.anchor:before { content: '\00A7'; font-size: .85em; vertical-align: text-top; display: block; margin-top: 0.05em; }
			 #content h1:hover > a.anchor, #content h1 > a.anchor:hover, h2:hover > a.anchor, h2 > a.anchor:hover, h3:hover > a.anchor, #toctitle:hover > a.anchor, .sidebarblock > .content > .title:hover > a.anchor, h3 > a.anchor:hover, #toctitle > a.anchor:hover, .sidebarblock > .content > .title > a.anchor:hover, h4:hover > a.anchor, h4 > a.anchor:hover, h5:hover > a.anchor, h5 > a.anchor:hover, h6:hover > a.anchor, h6 > a.anchor:hover { visibility: visible; }
			 #content h1 > a.link, h2 > a.link, h3 > a.link, #toctitle > a.link, .sidebarblock > .content > .title > a.link, h4 > a.link, h5 > a.link, h6 > a.link { color: #616366; text-decoration: none; }
			 #content h1 > a.link:hover, h2 > a.link:hover, h3 > a.link:hover, #toctitle > a.link:hover, .sidebarblock > .content > .title > a.link:hover, h4 > a.link:hover, h5 > a.link:hover, h6 > a.link:hover { color: #555659; }

			 .imageblock, .literalblock, .listingblock, .mathblock, .verseblock, .videoblock { margin-bottom: 1.25em; }

			 .admonitionblock td.content > .title, .exampleblock > .title, .imageblock > .title, .listingblock > .title, .literalblock > .title, .mathblock > .title, .openblock > .title, .paragraph > .title, .quoteblock > .title, .sidebarblock > .title, .tableblock > .title, .verseblock > .title, .videoblock > .title, .dlist > .title, .olist > .title, .ulist > .title, .qlist > .title, .hdlist > .title { text-align: left; font-weight: bold; }

			 .tableblock > caption { text-align: left; font-weight: bold; white-space: nowrap; overflow: visible; max-width: 0; }

			 table.tableblock #preamble > .sectionbody > .paragraph:first-of-type p { font-size: inherit; }

			 .admonitionblock > table { border: 0; background: none; width: 100%; }
			 .admonitionblock > table td.icon { text-align: center; width: 80px; }
			 .admonitionblock > table td.icon img { max-width: none; }
			 .admonitionblock > table td.icon .title { font-weight: bold; text-transform: uppercase; }
			 .admonitionblock > table td.content { padding-left: 1.125em; padding-right: 1.25em; border-left: 1px solid #dddddd; color: #616366; }
			 .admonitionblock > table td.content > :last-child > :last-child { margin-bottom: 0; }

			 .exampleblock > .content { border-style: solid; border-width: 1px; border-color: #e6e6e6; margin-bottom: 1.25em; padding: 1.25em; background: white; -webkit-border-radius: 4px; border-radius: 4px; }
			 .exampleblock > .content > :first-child { margin-top: 0; }
			 .exampleblock > .content > :last-child { margin-bottom: 0; }
			 .exampleblock > .content h1, .exampleblock > .content h2, .exampleblock > .content h3, .exampleblock > .content #toctitle, .sidebarblock.exampleblock > .content > .title, .exampleblock > .content h4, .exampleblock > .content h5, .exampleblock > .content h6, .exampleblock > .content p { color: #333333; }
			 .exampleblock > .content h1, .exampleblock > .content h2, .exampleblock > .content h3, .exampleblock > .content #toctitle, .sidebarblock.exampleblock > .content > .title, .exampleblock > .content h4, .exampleblock > .content h5, .exampleblock > .content h6 { line-height: 1; margin-bottom: 0.625em; }
			 .exampleblock > .content h1.subheader, .exampleblock > .content h2.subheader, .exampleblock > .content h3.subheader, .exampleblock > .content .subheader#toctitle, .sidebarblock.exampleblock > .content > .subheader.title, .exampleblock > .content h4.subheader, .exampleblock > .content h5.subheader, .exampleblock > .content h6.subheader { line-height: 1.4; }

			 .exampleblock.result > .content { -webkit-box-shadow: 0 1px 8px #d9d9d9; box-shadow: 0 1px 8px #d9d9d9; }

			 .sidebarblock { border-style: solid; border-width: 1px; border-color: #d9d9d9; margin-bottom: 1.25em; padding: 1.25em; background: #f2f2f2; -webkit-border-radius: 4px; border-radius: 4px; }
			 .sidebarblock > :first-child { margin-top: 0; }
			 .sidebarblock > :last-child { margin-bottom: 0; }
			 .sidebarblock h1, .sidebarblock h2, .sidebarblock h3, .sidebarblock #toctitle, .sidebarblock > .content > .title, .sidebarblock h4, .sidebarblock h5, .sidebarblock h6, .sidebarblock p { color: #333333; }
			 .sidebarblock h1, .sidebarblock h2, .sidebarblock h3, .sidebarblock #toctitle, .sidebarblock > .content > .title, .sidebarblock h4, .sidebarblock h5, .sidebarblock h6 { line-height: 1; margin-bottom: 0.625em; }
			 .sidebarblock h1.subheader, .sidebarblock h2.subheader, .sidebarblock h3.subheader, .sidebarblock .subheader#toctitle, .sidebarblock > .content > .subheader.title, .sidebarblock h4.subheader, .sidebarblock h5.subheader, .sidebarblock h6.subheader { line-height: 1.4; }
			 .sidebarblock > .content > .title { color: #3c3d3f; margin-top: 0; line-height: 1.5; }

			 .exampleblock > .content > :last-child > :last-child, .exampleblock > .content .olist > ol > li:last-child > :last-child, .exampleblock > .content .ulist > ul > li:last-child > :last-child, .exampleblock > .content .qlist > ol > li:last-child > :last-child, .sidebarblock > .content > :last-child > :last-child, .sidebarblock > .content .olist > ol > li:last-child > :last-child, .sidebarblock > .content .ulist > ul > li:last-child > :last-child, .sidebarblock > .content .qlist > ol > li:last-child > :last-child { margin-bottom: 0; }

			 .literalblock pre, .literalblock pre[class], .listingblock pre, .listingblock pre[class], .literalblock pre:not([class]), .listingblock pre:not([class]) {border-width: 0 0 1px 0; border-style: solid; border-color: #f0f0f0; -webkit-border-radius: 4px; border-radius: 4px; padding: 15px; word-wrap: break-word; background: url(data:image/png;base64,/9j/4QAYRXhpZgAASUkqAAgAAAAAAAAAAAAAAP/sABFEdWNreQABAAQAAABkAAD/4QMtaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLwA8P3hwYWNrZXQgYmVnaW49Iu+7vyIgaWQ9Ilc1TTBNcENlaGlIenJlU3pOVGN6a2M5ZCI/PiA8eDp4bXBtZXRhIHhtbG5zOng9ImFkb2JlOm5zOm1ldGEvIiB4OnhtcHRrPSJBZG9iZSBYTVAgQ29yZSA1LjMtYzAxMSA2Ni4xNDU2NjEsIDIwMTIvMDIvMDYtMTQ6NTY6MjcgICAgICAgICI+IDxyZGY6UkRGIHhtbG5zOnJkZj0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zIyI+IDxyZGY6RGVzY3JpcHRpb24gcmRmOmFib3V0PSIiIHhtbG5zOnhtcD0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLyIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bXA6Q3JlYXRvclRvb2w9IkFkb2JlIFBob3Rvc2hvcCBDUzYgKE1hY2ludG9zaCkiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6QTNDNTM3RjlGRTc3MTFFMUEwRkFGQUMwNUZCNEE2QzciIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6QTNDNTM3RkFGRTc3MTFFMUEwRkFGQUMwNUZCNEE2QzciPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDpBM0M1MzdGN0ZFNzcxMUUxQTBGQUZBQzA1RkI0QTZDNyIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDpBM0M1MzdGOEZFNzcxMUUxQTBGQUZBQzA1RkI0QTZDNyIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/Pv/uAA5BZG9iZQBkwAAAAAH/2wCEAAEBAQEBAQEBAQEBAQEBAQEB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); }

			 .literalblock pre.nowrap, .literalblock pre[class].nowrap, .listingblock pre.nowrap, .listingblock pre[class].nowrap { overflow-x: auto; white-space: pre; word-wrap: normal; }
			 .literalblock pre > code, .literalblock pre[class] > code, .listingblock pre > code, .listingblock pre[class] > code { display: block; }
			 @media only screen { .literalblock pre, .literalblock pre[class], .listingblock pre, .listingblock pre[class] { font-size: 0.64em; } }
			 @media only screen and (min-width: 768px) { .literalblock pre, .literalblock pre[class], .listingblock pre, .listingblock pre[class] { font-size: 0.72em; } }
			 @media only screen and (min-width: 1280px) { .literalblock pre, .literalblock pre[class], .listingblock pre, .listingblock pre[class] { font-size: 0.8em; } }

			 .listingblock pre.highlight { padding: 0; }
			 .listingblock pre.highlight > code { padding: 15px; }

			 .listingblock > .content { position: relative; }

			 .listingblock:hover code[class*=" language-"]:before { text-transform: uppercase; font-size: 0.9em; color: #999; position: absolute; top: 0.375em; right: 0.375em; }

			 .listingblock:hover code.asciidoc:before { content: "asciidoc"; }
			 .listingblock:hover code.clojure:before { content: "clojure"; }
			 .listingblock:hover code.css:before { content: "css"; }
			 .listingblock:hover code.groovy:before { content: "groovy"; }
			 .listingblock:hover code.html:before { content: "html"; }
			 .listingblock:hover code.java:before { content: "java"; }
			 .listingblock:hover code.javascript:before { content: "javascript"; }
			 .listingblock:hover code.python:before { content: "python"; }
			 .listingblock:hover code.ruby:before { content: "ruby"; }
			 .listingblock:hover code.sass:before { content: "sass"; }
			 .listingblock:hover code.scss:before { content: "scss"; }
			 .listingblock:hover code.xml:before { content: "xml"; }
			 .listingblock:hover code.yaml:before { content: "yaml"; }

			 .listingblock.terminal pre .command:before { content: attr(data-prompt); padding-right: 0.5em; color: #999; }

			 .listingblock.terminal pre .command:not([data-prompt]):before { content: '$'; }

			 table.pyhltable { border: 0; margin-bottom: 0; }

			 table.pyhltable td { vertical-align: top; padding-top: 0; padding-bottom: 0; }

			 table.pyhltable td.code { padding-left: .75em; padding-right: 0; }

			 .highlight.pygments .lineno, table.pyhltable td:not(.code) { color: #999; padding-left: 0; padding-right: .5em; border-right: 1px solid #dddddd; }

			 .highlight.pygments .lineno { display: inline-block; margin-right: .25em; }

			 table.pyhltable .linenodiv { background-color: transparent !important; padding-right: 0 !important; }

			 .quoteblock { margin: 0 0 0.9375em; padding: 0.5625em 1.25em 0 1.1875em; border-left: 1px solid #dddddd; }
			 .quoteblock blockquote { margin: 0 0 0.9375em 0; padding: 0 0 0.5625em 0; border: 0; }
			 .quoteblock blockquote > .paragraph:last-child p { margin-bottom: 0; }
			 .quoteblock .attribution { margin-top: -.25em; padding-bottom: 0.5625em; font-size: inherit; color: #484a4c; }
			 .quoteblock .attribution br { display: none; }
			 .quoteblock .attribution cite { display: block; margin-bottom: 0.625em; }

			 table thead th, table tfoot th { font-weight: bold; }

			 table.tableblock.grid-all { border-collapse: separate; border-spacing: 1px; -webkit-border-radius: 4px; border-radius: 4px; border-top: 5px solid white; border-bottom: 5px solid white; }

			 table.tableblock.frame-topbot, table.tableblock.frame-none { border-left: 0; border-right: 0; }

			 table.tableblock.frame-sides, table.tableblock.frame-none { border-top: 0; border-bottom: 0; }

			 table.tableblock td .paragraph:last-child p > p:last-child, table.tableblock th > p:last-child, table.tableblock td > p:last-child { margin-bottom: 0; }

			 th.tableblock.halign-left, td.tableblock.halign-left { text-align: left; }

			 th.tableblock.halign-right, td.tableblock.halign-right { text-align: right; }

			 th.tableblock.halign-center, td.tableblock.halign-center { text-align: center; }

			 th.tableblock.valign-top, td.tableblock.valign-top { vertical-align: top; }

			 th.tableblock.valign-bottom, td.tableblock.valign-bottom { vertical-align: bottom; }

			 th.tableblock.valign-middle, td.tableblock.valign-middle { vertical-align: middle; }

			 tbody tr th { display: table-cell; line-height: 1.5; background: #dfdfdf; }

			 tbody tr th, tbody tr th p, tfoot tr th, tfoot tr th p { color: #222222; font-weight: bold; }

			 td > div.verse { white-space: pre; }

			 ol { margin-left: 1.75em; }

			 ul li ol { margin-left: 1.5em; }

			 dl dd { margin-left: 1.125em; }

			 dl dd:last-child, dl dd:last-child > :last-child { margin-bottom: 0; }

			 ol > li p, ul > li p, ul dd, ol dd, .olist .olist, .ulist .ulist, .ulist .olist, .olist .ulist { margin-bottom: 0.46875em; }

			 ul.unstyled, ol.unnumbered, ul.checklist, ul.none { list-style-type: none; }

			 ul.unstyled, ol.unnumbered, ul.checklist { margin-left: 0.625em; }

			 ul.checklist li > p:first-child > i[class^="icon-check"]:first-child, ul.checklist li > p:first-child > input[type="checkbox"]:first-child { margin-right: 0.25em; }

			 ul.checklist li > p:first-child > input[type="checkbox"]:first-child { position: relative; top: 1px; }

			 ul.inline { margin: 0 auto 0.46875em auto; margin-left: -1.375em; margin-right: 0; padding: 0; list-style: none; overflow: hidden; }
			 ul.inline > li { list-style: none; float: left; margin-left: 1.375em; display: block; }
			 ul.inline > li > * { display: block; }

			 .unstyled dl dt { font-weight: normal; font-style: normal; }

			 ol.arabic { list-style-type: decimal; }

			 ol.decimal { list-style-type: decimal-leading-zero; }

			 ol.loweralpha { list-style-type: lower-alpha; }

			 ol.upperalpha { list-style-type: upper-alpha; }

			 ol.lowerroman { list-style-type: lower-roman; }

			 ol.upperroman { list-style-type: upper-roman; }

			 ol.lowergreek { list-style-type: lower-greek; }

			 .hdlist > table, .colist > table { border: 0; background: none; }
			 .hdlist > table > tbody > tr, .colist > table > tbody > tr { background: none; }

			 td.hdlist1 { padding-right: .75em; font-weight: bold; }

			 td.hdlist1, td.hdlist2 { vertical-align: top; }

			 .literalblock + .colist, .listingblock + .colist { margin-top: -0.5em; }

			 .colist > table tr > td:first-of-type { padding: 0 .75em; line-height: 1; }
			 .colist > table tr > td:last-of-type { padding: 0.25em 0; }

			 .qanda > ol > li > p > em:only-child { color: #247494; }

			 .thumb, .th { line-height: 0; display: inline-block; border: solid 4px white; -webkit-box-shadow: 0 0 0 1px #dddddd; box-shadow: 0 0 0 1px #dddddd; }

			 .imageblock.left, .imageblock[style*="float: left"] { margin: 0.25em 0.625em 1.25em 0; }
			 .imageblock.right, .imageblock[style*="float: right"] { margin: 0.25em 0 1.25em 0.625em; }
			 .imageblock > .title { margin-bottom: 0; }
			 .imageblock.thumb, .imageblock.th { border-width: 6px; }
			 .imageblock.thumb > .title, .imageblock.th > .title { padding: 0 0.125em; }

			 .image.left, .image.right { margin-top: 0.25em; margin-bottom: 0.25em; display: inline-block; line-height: 0; }
			 .image.left { margin-right: 0.625em; }
			 .image.right { margin-left: 0.625em; }

			 a.image { text-decoration: none; }

			 span.footnote, span.footnoteref { vertical-align: super; font-size: 0.875em; }
			 span.footnote a, span.footnoteref a { text-decoration: none; }

			 #footnotes { padding-top: 0.75em; padding-bottom: 0.75em; margin-bottom: 0.625em; }
			 #footnotes hr { width: 20%; min-width: 6.25em; margin: -.25em 0 .75em 0; border-width: 1px 0 0 0; }
			 #footnotes .footnote { padding: 0 0.375em; line-height: 1.3; font-size: 0.875em; margin-left: 1.2em; text-indent: -1.2em; margin-bottom: .2em; }
			 #footnotes .footnote a:first-of-type { font-weight: bold; text-decoration: none; }
			 #footnotes .footnote:last-of-type { margin-bottom: 0; }

			 #content #footnotes { margin-top: -0.625em; margin-bottom: 0; padding: 0.75em 0; }

			 .gist .file-data > table { border: none; background: #fff; width: 100%; margin-bottom: 0; }
			 .gist .file-data > table td.line-data { width: 99%; }

			 div.unbreakable { page-break-inside: avoid; }

			 .big { font-size: larger; }

			 .small { font-size: smaller; }

			 .underline { text-decoration: underline; }

			 .overline { text-decoration: overline; }

			 .line-through { text-decoration: line-through; }

			 .aqua { color: #00bfbf; }

			 .aqua-background { background-color: #00fafa; }

			 .black { color: black; }

			 .black-background { background-color: black; }

			 .blue { color: #0000bf; }

			 .blue-background { background-color: #0000fa; }

			 .fuchsia { color: #bf00bf; }

			 .fuchsia-background { background-color: #fa00fa; }

			 .gray { color: #606060; }

			 .gray-background { background-color: #7d7d7d; }

			 .green { color: #006000; }

			 .green-background { background-color: #007d00; }

			 .lime { color: #00bf00; }

			 .lime-background { background-color: #00fa00; }

			 .maroon { color: #600000; }

			 .maroon-background { background-color: #7d0000; }

			 .navy { color: #000060; }

			 .navy-background { background-color: #00007d; }

			 .olive { color: #606000; }

			 .olive-background { background-color: #7d7d00; }

			 .purple { color: #600060; }

			 .purple-background { background-color: #7d007d; }

			 .red { color: #bf0000; }

			 .red-background { background-color: #fa0000; }

			 .silver { color: #909090; }

			 .silver-background { background-color: #bcbcbc; }

			 .teal { color: #006060; }

			 .teal-background { background-color: #007d7d; }

			 .white { color: #bfbfbf; }

			 .white-background { background-color: #fafafa; }

			 .yellow { color: #bfbf00; }

			 .yellow-background { background-color: #fafa00; }

			 span.icon > [class^="icon-"], span.icon > [class*=" icon-"] { cursor: default; }

			 .admonitionblock td.icon [class^="icon-"]:before { font-size: 2.5em; text-shadow: 0 0 8px white, 1px 1px 2px rgba(0, 0, 0, 0.5); cursor: default; }
			 .admonitionblock td.icon .icon-note:before { content: "\f05a"; color: #2984a9; color: #1f637f; }
			 .admonitionblock td.icon .icon-tip:before { content: "\f0eb"; text-shadow: 1px 1px 2px rgba(155, 155, 0, 0.8); color: #111; }
			 .admonitionblock td.icon .icon-warning:before { content: "\f071"; color: #bf6900; }
			 .admonitionblock td.icon .icon-caution:before { content: "\f06d"; color: #bf3400; }
			 .admonitionblock td.icon .icon-important:before { content: "\f06a"; color: #bf0000; }

			 .conum { display: inline-block; color: white !important; background-color: #515151; -webkit-border-radius: 100px; border-radius: 100px; text-align: center; width: 20px; height: 20px; font-size: 12px; font-weight: bold; line-height: 20px; font-family: Arial, sans-serif; font-style: normal; position: relative; top: -2px; letter-spacing: -1px; }
			 .conum * { color: white !important; }
			 .conum + b { display: none; }
			 .conum:after { content: attr(data-value); }
			 .conum:not([data-value]):empty { display: none; }

			 body { background-image: url(data:image/png;base64,/9j/4QAYRXhpZgAASUkqAAgAAAAAAAAAAAAAAP/sABFEdWNreQABAAQAAABkAAD/4QMtaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLwA8P3hwYWNrZXQgYmVnaW49Iu+7vyIgaWQ9Ilc1TTBNcENlaGlIenJlU3pOVGN6a2M5ZCI/PiA8eDp4bXBtZXRhIHhtbG5zOng9ImFkb2JlOm5zOm1ldGEvIiB4OnhtcHRrPSJBZG9iZSBYTVAgQ29yZSA1LjMtYzAxMSA2Ni4xNDU2NjEsIDIwMTIvMDIvMDYtMTQ6NTY6MjcgICAgICAgICI+IDxyZGY6UkRGIHhtbG5zOnJkZj0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zIyI+IDxyZGY6RGVzY3JpcHRpb24gcmRmOmFib3V0PSIiIHhtbG5zOnhtcD0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLyIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bXA6Q3JlYXRvclRvb2w9IkFkb2JlIFBob3Rvc2hvcCBDUzYgKE1hY2ludG9zaCkiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6OUU2RkEyNUNGOUJFMTFFMUI1NjNEMjJCMUQ3NDg4RDIiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6OUU2RkEyNURGOUJFMTFFMUI1NjNEMjJCMUQ3NDg4RDIiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDo5RTZGQTI1QUY5QkUxMUUxQjU2M0QyMkIxRDc0ODhEMiIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDo5RTZGQTI1QkY5QkUxMUUxQjU2M0QyMkIxRDc0ODhEMiIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/Pv/uAA5BZG9iZQBkwAAAAAH/2wCEAAEBAQEBAQEBAQEBAQEBAQEB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); }

			 ::selection { background-color: #fcc07f; color: #fff; }

			 #header h1 { font-weight: bold; }

			 .literalblock > .content > pre, .listingblock > .content > pre { -webkit-box-shadow: inset 0 1px 4px #aeb9b6; box-shadow: inset 0 1px 4px #aeb9b6; -webkit-border-radius: 5px; border-radius: 5px; }

			 #content ul > li { list-style-type: square; }

			 p > em { font-family: 'Noticia Text', serif; font-weight: 400; font-size: 95%; }

			 .admonitionblock > table { width: 100%; background-image: url(data:image/png;base64,/9j/4QAYRXhpZgAASUkqAAgAAAAAAAAAAAAAAP/sABFEdWNreQABAAQAAABkAAD/4QMtaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLwA8P3hwYWNrZXQgYmVnaW49Iu+7vyIgaWQ9Ilc1TTBNcENlaGlIenJlU3pOVGN6a2M5ZCI/PiA8eDp4bXBtZXRhIHhtbG5zOng9ImFkb2JlOm5zOm1ldGEvIiB4OnhtcHRrPSJBZG9iZSBYTVAgQ29yZSA1LjMtYzAxMSA2Ni4xNDU2NjEsIDIwMTIvMDIvMDYtMTQ6NTY6MjcgICAgICAgICI+IDxyZGY6UkRGIHhtbG5zOnJkZj0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zIyI+IDxyZGY6RGVzY3JpcHRpb24gcmRmOmFib3V0PSIiIHhtbG5zOnhtcD0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLyIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bXA6Q3JlYXRvclRvb2w9IkFkb2JlIFBob3Rvc2hvcCBDUzYgKE1hY2ludG9zaCkiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6RTVCOUM2QUIwNjYyMTFFMkJGRTVFMzQwMTA1MkVDQzEiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6RTVCOUM2QUMwNjYyMTFFMkJGRTVFMzQwMTA1MkVDQzEiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDpFNUI5QzZBOTA2NjIxMUUyQkZFNUUzNDAxMDUyRUNDMSIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDpFNUI5QzZBQTA2NjIxMUUyQkZFNUUzNDAxMDUyRUNDMSIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/Pv/uAA5BZG9iZQBkwAAAAAH/2wCEAAEBAQEBAQEBAQEBAQEBAQEB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); border-collapse: separate; border-spacing: 0; -webkit-border-radius: 5px; border-radius: 5px; border: 1px solid #9EC6DF; }
			 .admonitionblock > table td.icon { padding: 15px; }
			 .admonitionblock > table td.icon .icon-tip:before { text-shadow: 0 0 20px white, 1px 1px 2px rgba(155, 155, 0, 0.8); }
			 .admonitionblock > table td.content { font-family: 'Noticia Text', italic; font-size: 90%; font-style: italic; border: 0; padding: 15px; }

			 .admonitionblock .literalblock > .content > pre, .admonitionblock .listingblock > .content > pre { background-image: url('../images/riak/info-bg.jpg'); }

			 .exampleblock > .content { background-color: transparent; border-color: #c9c9c9; }

			 .sidebarblock { background-image: url(data:image/png;base64,/9j/4QAYRXhpZgAASUkqAAgAAAAAAAAAAAAAAP/sABFEdWNreQABAAQAAABkAAD/4QMtaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLwA8P3hwYWNrZXQgYmVnaW49Iu+7vyIgaWQ9Ilc1TTBNcENlaGlIenJlU3pOVGN6a2M5ZCI/PiA8eDp4bXBtZXRhIHhtbG5zOng9ImFkb2JlOm5zOm1ldGEvIiB4OnhtcHRrPSJBZG9iZSBYTVAgQ29yZSA1LjMtYzAxMSA2Ni4xNDU2NjEsIDIwMTIvMDIvMDYtMTQ6NTY6MjcgICAgICAgICI+IDxyZGY6UkRGIHhtbG5zOnJkZj0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zIyI+IDxyZGY6RGVzY3JpcHRpb24gcmRmOmFib3V0PSIiIHhtbG5zOnhtcD0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLyIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bXA6Q3JlYXRvclRvb2w9IkFkb2JlIFBob3Rvc2hvcCBDUzYgKE1hY2ludG9zaCkiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6RkNDOTcyQTVGOUU1MTFFMUI1NjNEMjJCMUQ3NDg4RDIiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6RkNDOTcyQTZGOUU1MTFFMUI1NjNEMjJCMUQ3NDg4RDIiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDo5RTZGQTI1RUY5QkUxMUUxQjU2M0QyMkIxRDc0ODhEMiIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDpGQ0M5NzJBNEY5RTUxMUUxQjU2M0QyMkIxRDc0ODhEMiIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/Pv/uAA5BZG9iZQBkwAAAAAH/2wCEAAEBAQEBAQEBAQEBAQEBAQEB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); -webkit-border-radius: 5px; border-radius: 5px; }
			 .sidebarblock > .content > .title { color: #f1f1f1; text-shadow: 0px 2px 2px black; font-size: 1.25em; font-weight: bold; }
			 .sidebarblock > .content ul, .sidebarblock > .content p { color: #f1f1f1; text-shadow: 0px 1px 1px black; }
			 .sidebarblock > .content .title { color: #dfdfdf; }
			 .sidebarblock > .content code { color: #333; }
			 .sidebarblock > .content a { color: #60B5D8; }
			 .sidebarblock > .content a:hover { color: #FAA94C; }
			 .sidebarblock > .content .admonitionblock p, .sidebarblock > .content .admonitionblock ul { text-shadow: none; color: #616366; }

			 table.tableblock.grid-all { -webkit-border-radius: 0; border-radius: 0; -webkit-box-shadow: 0 1px 3px #999999; box-shadow: 0 1px 3px #999999; }

			 #footer { background-image: url(data:image/png;base64,/9j/4QAYRXhpZgAASUkqAAgAAAAAAAAAAAAAAP/sABFEdWNreQABAAQAAABkAAD/4QMtaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLwA8P3hwYWNrZXQgYmVnaW49Iu+7vyIgaWQ9Ilc1TTBNcENlaGlIenJlU3pOVGN6a2M5ZCI/PiA8eDp4bXBtZXRhIHhtbG5zOng9ImFkb2JlOm5zOm1ldGEvIiB4OnhtcHRrPSJBZG9iZSBYTVAgQ29yZSA1LjMtYzAxMSA2Ni4xNDU2NjEsIDIwMTIvMDIvMDYtMTQ6NTY6MjcgICAgICAgICI+IDxyZGY6UkRGIHhtbG5zOnJkZj0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zIyI+IDxyZGY6RGVzY3JpcHRpb24gcmRmOmFib3V0PSIiIHhtbG5zOnhtcD0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLyIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bXA6Q3JlYXRvclRvb2w9IkFkb2JlIFBob3Rvc2hvcCBDUzYgKE1hY2ludG9zaCkiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6N0IwRjA2MkVGQzI5MTFFMTlGRUFGRjBGMUYzRTgyQUQiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6N0IwRjA2MkZGQzI5MTFFMTlGRUFGRjBGMUYzRTgyQUQiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDo3QjBGMDYyQ0ZDMjkxMUUxOUZFQUZGMEYxRjNFODJBRCIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDo3QjBGMDYyREZDMjkxMUUxOUZFQUZGMEYxRjNFODJBRCIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/Pv/uAA5BZG9iZQBkwAAAAAH/2wCEAAEBAQEBAQEBAQEBAQEBAQEB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); padding: 25px 0; }

			 #footer-text { color: #fff; text-shadow: 1px 1px 1px #333; font-size: 80%; text-align: center; }
		'''
	}

	def genDocumentationReadme() {
		'''
			Readme File
			===========

			What's in this directory?
			-------------------------

			This directory contains a set of documentation generated from the Yaktor business languages.

			All the documentation is in the format asciidoc.
			You can read about asciidoc [here](http://www.methods.co.nz/asciidoc/).

			Utilities
			---------

			For your convenience, we have generated scripts that may be useful.

			**buildAll.rb**
			This is a ruby script that will compile all the asciidoc files (convert them into HTML)
			and generate an index file that links to all the generated files.

			If you are familiar (and have installed nodemon), a convenient way to ensure that
			the documents are always available and compiled is to run the following command
			inside this directory:

			`«genNodeMonCommand»`

			This will run a process that kicks off the ruby script whenever one of the asciidoc files have been changed.

			How to work?
			------------

			We recommend that you integrate these files with longer narratives that you may build to document your applicaiton.
			Please note that you can ammend the generated documentation with your own using comment blocks in the language.
			The comment blocks relate to the generated documentation in a predictable way.
			We relate the comments immediately above the element being documented.

			The comments have to be of type multiline for us to weave it into the generated documentation. E.g.:

				/*
				 * This comment will be weaved and relates to the entity MyEntity
				 */
				 entity MyEntity {
				 	// This comment is ignored because it is single-lined. Hence, no comment for attr1
				 	String attr1
				 	/*
				 	 * This comment is ignored becase it is 'overridden' by the next comment
				 	 */
				 	/*
				 	 * This comment will be weaved and related to attr2
				 	 */
				 	 String attr2
				 }

			Please also note that you have the full power of asciidoc inside the comments.
			That is, you can do anything to enahnce the markup.
			Please see the above reference to learn more about the asciidoc syntax.

			We can imagine a few different ways of working:

			1. You may keep a documentation director outside the *doc* directory where you keep manually created documentation.
			   From the manually maintained documentation you may link in the generated documentation.
			2. You may decide to copy the generated files over to a separate documentation project for manual manipulation.
			   This is not quite as painful as it may first sound.
			   You can always do a merge between the manually modified documantation and the generated one

		'''
	}
}
