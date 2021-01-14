package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2JB  reason: invalid class name */
public abstract class AnonymousClass2JB extends FrameLayout {
    public ViewGroup A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public TextView A03;
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();

    public abstract int getNegativeButtonTextResId();

    public abstract int getPositiveButtonIconResId();

    public abstract int getPositiveButtonTextResId();

    public AnonymousClass2JB(Context context) {
        super(context);
        FrameLayout.inflate(context, R.layout.conversation_footer, this);
        this.A00 = (ViewGroup) findViewById(R.id.content);
        this.A03 = (TextView) findViewById(R.id.header);
        this.A02 = (ViewGroup) findViewById(R.id.positive_btn);
        this.A01 = (ViewGroup) findViewById(R.id.negative_btn);
        ((ImageView) findViewById(R.id.positive_btn_icon)).setImageResource(getPositiveButtonIconResId());
        TextView textView = (TextView) findViewById(R.id.positive_btn_text);
        C002301g.A03(textView);
        textView.setText(this.A04.A06(getPositiveButtonTextResId()));
        TextView textView2 = (TextView) findViewById(R.id.negative_btn_text);
        C002301g.A03(textView2);
        textView2.setText(this.A04.A06(getNegativeButtonTextResId()));
    }
}
