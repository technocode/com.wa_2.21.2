package X;

import android.content.DialogInterface;
import com.whatsapp.BlockConfirmationDialogFragment;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1HU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1HU implements DialogInterface.OnClickListener {
    public final /* synthetic */ BlockConfirmationDialogFragment A00;
    public final /* synthetic */ ActivityC004702f A01;
    public final /* synthetic */ C007003k A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ AtomicInteger A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ String[] A07;

    public /* synthetic */ AnonymousClass1HU(BlockConfirmationDialogFragment blockConfirmationDialogFragment, AtomicInteger atomicInteger, String[] strArr, boolean z, ActivityC004702f r5, C007003k r6, String str, boolean z2) {
        this.A00 = blockConfirmationDialogFragment;
        this.A04 = atomicInteger;
        this.A07 = strArr;
        this.A05 = z;
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = str;
        this.A06 = z2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        BlockConfirmationDialogFragment blockConfirmationDialogFragment = this.A00;
        AtomicInteger atomicInteger = this.A04;
        String[] strArr = this.A07;
        boolean z = this.A05;
        ActivityC004702f r7 = this.A01;
        C007003k r11 = this.A02;
        String str2 = this.A03;
        boolean z2 = this.A06;
        if (atomicInteger.get() == -1) {
            str = null;
        } else {
            str = strArr[atomicInteger.get()];
        }
        if (z) {
            blockConfirmationDialogFragment.A09.ANC(new C10740f7(r7, blockConfirmationDialogFragment.A04, blockConfirmationDialogFragment.A07, r7, r11, str, str2), new Void[0]);
        } else {
            blockConfirmationDialogFragment.A01.A0A(r7, true, str, z2, r11, str2);
        }
    }
}
