package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.SetStatus;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;

/* renamed from: X.1NZ  reason: invalid class name */
public class AnonymousClass1NZ extends ArrayAdapter {
    public ArrayList A00;
    public final /* synthetic */ SetStatus A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1NZ(SetStatus setStatus, Context context, ArrayList arrayList) {
        super(context, (int) R.id.status_row, arrayList);
        this.A01 = setStatus;
        this.A00 = arrayList;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextEmojiLabel textEmojiLabel;
        if (view == null) {
            view = ((LayoutInflater) this.A01.getSystemService("layout_inflater")).inflate(R.layout.setstatus_row, (ViewGroup) null);
        }
        String str = (String) this.A00.get(i);
        if (!(str == null || (textEmojiLabel = (TextEmojiLabel) view.findViewById(R.id.status_row)) == null)) {
            View findViewById = view.findViewById(R.id.status_selected_check);
            SetStatus setStatus = this.A01;
            int i2 = 4;
            if (str.equals(setStatus.A06.A01())) {
                i2 = 0;
            }
            findViewById.setVisibility(i2);
            findViewById.setContentDescription(((AnonymousClass2C0) setStatus).A01.A06(R.string.checked_icon_label));
            textEmojiLabel.A04(str, null, false, 0);
        }
        return view;
    }
}
