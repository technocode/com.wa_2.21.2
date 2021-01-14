package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2aW  reason: invalid class name and case insensitive filesystem */
public class C52062aW extends AbstractC16300pa {
    public int A00 = -1;
    public C52032aT A01;
    public final List A02 = new ArrayList();

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A02.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new C59352nV(from.inflate(R.layout.select_list_bottom_sheet_section_item, viewGroup, false));
        }
        return new C59342nU(this, from.inflate(R.layout.select_list_bottom_sheet_item, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r8, int i) {
        AbstractC52052aV r82 = (AbstractC52052aV) r8;
        if (A00(i) == 0) {
            C59352nV r83 = (C59352nV) r82;
            String str = ((AnonymousClass2JF) this.A02.get(i)).A01;
            if (r83 == null) {
                throw null;
            } else if (TextUtils.isEmpty(str)) {
                r83.A0H.setVisibility(8);
            } else {
                r83.A0H.setVisibility(0);
                r83.A00.A04(str, null, false, 0);
            }
        } else {
            AnonymousClass1XR r6 = ((AnonymousClass2JF) this.A02.get(i)).A00;
            C59342nU r84 = (C59342nU) r82;
            if (r6 == null) {
                r84.A0H.setVisibility(8);
                return;
            }
            RadioButton radioButton = r84.A00;
            boolean z = false;
            if (r84.A00() == r84.A03.A00) {
                z = true;
            }
            radioButton.setChecked(z);
            r84.A0H.setVisibility(0);
            r84.A02.A02(r6.A02);
            String str2 = r6.A00;
            if (TextUtils.isEmpty(str2)) {
                r84.A01.setVisibility(8);
                return;
            }
            TextEmojiLabel textEmojiLabel = r84.A01;
            textEmojiLabel.A02(str2);
            textEmojiLabel.setVisibility(0);
        }
    }
}
