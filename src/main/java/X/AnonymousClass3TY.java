package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallPictureGrid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3TY  reason: invalid class name */
public class AnonymousClass3TY extends AbstractC16300pa {
    public int A00;
    public AnonymousClass0YX A01;
    public CallInfo A02;
    public AbstractC07240Wo A03;
    public final AnonymousClass01A A04 = AnonymousClass01A.A00();
    public final AnonymousClass01X A05 = AnonymousClass01X.A00();
    public final Integer A06 = 1;
    public final Integer A07 = 0;
    public final List A08 = new ArrayList();
    public final /* synthetic */ CallPictureGrid A09;

    public AnonymousClass3TY(CallPictureGrid callPictureGrid, int i) {
        this.A09 = callPictureGrid;
        this.A00 = i;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A08.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new AnonymousClass3TX(LayoutInflater.from(this.A09.getContext()).inflate(R.layout.audio_call_participant_view, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r2, int i) {
        A09((AnonymousClass3TX) r2, i, Collections.emptyList());
    }

    public final int A08(int i) {
        int i2;
        if (A05() == 0 || this.A00 == 0) {
            return 0;
        }
        int A052 = A05();
        if (A052 >= 3) {
            int i3 = (A052 + 1) >> 1;
            if (!(A052 == 3 || (i2 = A052 % 2) == 0 || i % 2 < i2)) {
                i3--;
            }
            A052 = i3;
        }
        return (int) (((float) this.A00) / ((float) A052));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r5 == 3) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0141, code lost:
        if (r5 == 3) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.AnonymousClass3TX r10, int r11, java.util.List r12) {
        /*
        // Method dump skipped, instructions count: 395
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TY.A09(X.3TX, int, java.util.List):void");
    }
}
