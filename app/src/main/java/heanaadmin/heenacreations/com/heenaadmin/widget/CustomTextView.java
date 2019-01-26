package heanaadmin.heenacreations.com.heenaadmin.widget;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by ajitzegde on 22/9/15.
 */
public class CustomTextView extends android.support.v7.widget.AppCompatTextView {

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomTextView(Context context) {
        super(context);
        init();
    }

    public void init() {
//        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/arial.ttf");
//        setTypeface(tf);
    }
}
