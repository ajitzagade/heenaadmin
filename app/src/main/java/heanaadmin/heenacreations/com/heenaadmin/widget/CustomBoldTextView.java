package heanaadmin.heenacreations.com.heenaadmin.widget;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by ajitzegde on 22/9/15.
 */
public class CustomBoldTextView extends android.support.v7.widget.AppCompatTextView {

    public CustomBoldTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomBoldTextView(Context context) {
        super(context);
        init();
    }

    public void init() {
      //  Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/arial_bold.ttf");
//        setTypeface( Typeface.BOLD);
//        setTypeface(tf);

    }
}
