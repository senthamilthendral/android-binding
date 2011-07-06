package gueei.binding.viewAttributes;

import gueei.binding.BindingType;
import gueei.binding.ViewAttribute;
import android.graphics.drawable.Drawable;
import android.view.View;


public class BackgroundColorViewAttribute extends ViewAttribute<View, Integer> {

	public BackgroundColorViewAttribute(View view) {
		super(Integer.class, view, "backgroundColor");
	}

	@Override
	protected void doSetAttributeValue(Object newValue) {
		if (newValue==null){
			getView().setBackgroundColor(0);
			return;
		}
		if (newValue instanceof Integer){
			getView().setBackgroundResource((Integer)newValue);
		}
	}

	@Override
	protected BindingType AcceptThisTypeAs(Class<?> type) {
		return BindingType.OneWay;
	}

	@Override
	public Integer get() {
		return null;
	}
}