package net.iowaline.freemorse;

import android.content.Context;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import android.view.View;

public class DotDashKeyboardView extends KeyboardView {

	private FMService service;
	
	public void setService( FMService service ) {
		this.service = service;
	}
	
	public DotDashKeyboardView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public DotDashKeyboardView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	
	@Override
	protected void onVisibilityChanged(View changedView, int visibility) {
		if (visibility == VISIBLE) {
			service.clearEverything();
		}
		super.onVisibilityChanged(changedView, visibility);
	}
}
