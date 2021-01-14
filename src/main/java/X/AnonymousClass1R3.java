package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;
import java.util.List;

/* renamed from: X.1R3  reason: invalid class name */
public class AnonymousClass1R3 extends SimpleAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SingleChoiceListDialogFragment A01;
    public final /* synthetic */ String[] A02;
    public final /* synthetic */ boolean[] A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1R3(SingleChoiceListDialogFragment singleChoiceListDialogFragment, Context context, List list, String[] strArr, int[] iArr, boolean[] zArr, int i, String[] strArr2) {
        super(context, list, R.layout.simple_list_item_2_single_choice, strArr, iArr);
        this.A01 = singleChoiceListDialogFragment;
        this.A03 = zArr;
        this.A00 = i;
        this.A02 = strArr2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        TextView textView = (TextView) view2.findViewById(16908308);
        TextView textView2 = (TextView) view2.findViewById(16908309);
        SingleChoiceListDialogFragment singleChoiceListDialogFragment = this.A01;
        if (singleChoiceListDialogFragment.A0U()) {
            boolean[] zArr = this.A03;
            if (zArr == null || zArr[i]) {
                textView.setTextColor(C004302a.A00(singleChoiceListDialogFragment.A00(), R.color.settings_item_title_text));
                textView2.setTextColor(C004302a.A00(singleChoiceListDialogFragment.A00(), R.color.settings_item_title_text));
            } else {
                textView.setTextColor(C004302a.A00(singleChoiceListDialogFragment.A00(), R.color.settings_disabled_text));
                textView2.setTextColor(C004302a.A00(singleChoiceListDialogFragment.A00(), R.color.settings_disabled_text));
            }
        }
        if (TextUtils.isEmpty(textView2.getText())) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
        }
        int i2 = this.A00;
        if (i2 < 0 || !TextUtils.equals(this.A02[i2], textView.getText())) {
            ((CompoundButton) view2.findViewById(R.id.radio)).setChecked(false);
            return view2;
        }
        ((CompoundButton) view2.findViewById(R.id.radio)).setChecked(true);
        return view2;
    }
}
