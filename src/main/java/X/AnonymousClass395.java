package X;

import android.view.ViewTreeObserver;
import com.whatsapp.voipcalling.GroupCallParticipantPickerSheet;

/* renamed from: X.395  reason: invalid class name */
public class AnonymousClass395 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ GroupCallParticipantPickerSheet A00;

    public AnonymousClass395(GroupCallParticipantPickerSheet groupCallParticipantPickerSheet) {
        this.A00 = groupCallParticipantPickerSheet;
    }

    public void onGlobalLayout() {
        GroupCallParticipantPickerSheet groupCallParticipantPickerSheet = this.A00;
        groupCallParticipantPickerSheet.A03.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (!groupCallParticipantPickerSheet.A09) {
            groupCallParticipantPickerSheet.A08.A0D(4);
        }
        groupCallParticipantPickerSheet.A09 = false;
    }
}
