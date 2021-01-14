package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.1uB  reason: invalid class name and case insensitive filesystem */
public class C40951uB extends AbstractC11910hD {
    public final View A00;
    public final View A01;
    public final CheckBox A02;
    public final ImageView A03;
    public final ImageView A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;

    public C40951uB(View view) {
        super(view);
        this.A07 = (TextView) view.findViewById(R.id.title_tv);
        this.A06 = (TextView) view.findViewById(R.id.subtitle_tv);
        this.A01 = view.findViewById(R.id.primary_action_btn);
        this.A03 = (ImageView) view.findViewById(R.id.primary_action_icon);
        this.A04 = (ImageView) view.findViewById(R.id.secondary_action_btn);
        this.A05 = (ImageView) view.findViewById(R.id.third_action_btn);
        this.A02 = (CheckBox) view.findViewById(R.id.cbx);
        this.A00 = view;
    }
}
