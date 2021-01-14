package X;

import android.os.Build;
import android.view.View;
import com.whatsapp.voipcalling.GroupCallParticipantPickerSheet;

/* renamed from: X.3To  reason: invalid class name and case insensitive filesystem */
public class C72613To extends AnonymousClass1DH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ GroupCallParticipantPickerSheet A02;

    public C72613To(GroupCallParticipantPickerSheet groupCallParticipantPickerSheet, int i, int i2) {
        this.A02 = groupCallParticipantPickerSheet;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.AnonymousClass1DH
    public void A00(View view, float f) {
        GroupCallParticipantPickerSheet groupCallParticipantPickerSheet = this.A02;
        float top = (groupCallParticipantPickerSheet.A01 - ((float) view.getTop())) / groupCallParticipantPickerSheet.A00;
        groupCallParticipantPickerSheet.A02.setColor(((int) (127.0f * top)) << 24);
        if (Build.VERSION.SDK_INT >= 21) {
            groupCallParticipantPickerSheet.getWindow().setStatusBarColor(C004402b.A04(this.A00, this.A01, top));
        }
    }
}
