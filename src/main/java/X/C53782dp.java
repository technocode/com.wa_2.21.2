package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2dp  reason: invalid class name and case insensitive filesystem */
public class C53782dp extends AbstractC11910hD {
    public final CheckBox A00;
    public final TextView A01;

    public C53782dp(View view) {
        super(view);
        this.A01 = (TextView) AnonymousClass0Q7.A0D(view, R.id.media_section);
        CheckBox checkBox = (CheckBox) AnonymousClass0Q7.A0D(view, R.id.media_select_all_checkbox);
        this.A00 = checkBox;
        checkBox.setText(view.getResources().getText(R.string.select_all));
        this.A00.setOnCheckedChangeListener(AnonymousClass2OX.A00);
    }
}
