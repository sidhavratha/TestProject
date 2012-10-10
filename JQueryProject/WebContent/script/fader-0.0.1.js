(function($){
	$.fn.fadeOnClick = function(){
		this.click(function(){
			//console.log(this);
			console.log($(this));
			$(this).prev().fadeToggle("normal");
		});
	};
})(jQuery);