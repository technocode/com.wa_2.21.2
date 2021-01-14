package X;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;

/* renamed from: X.2ZE  reason: invalid class name */
public class AnonymousClass2ZE extends AnonymousClass0JW {
    public final C26491Ld A00;
    public final C014308b A01;
    public final AnonymousClass00C A02;
    public final AnonymousClass01X A03;
    public final C47912Ke A04;
    public final C007003k A05;
    public final WeakReference A06;
    public final WeakReference A07;
    public final boolean A08;

    public AnonymousClass2ZE(Context context, C47912Ke r3, C014308b r4, AnonymousClass00C r5, AnonymousClass01X r6, AbstractC004502c r7, C007003k r8, C26491Ld r9, boolean z) {
        this.A06 = new WeakReference(context);
        this.A02 = r5;
        this.A03 = r6;
        this.A07 = new WeakReference(r7);
        this.A08 = z;
        this.A04 = r3;
        this.A01 = r4;
        this.A05 = r8;
        this.A00 = r9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v48, resolved type: X.08b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01b3, code lost:
        if (r7.contains(r15) != false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01ba, code lost:
        if (r7.contains(r15) == false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0782, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:?, code lost:
        r27.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0786, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0807, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:?, code lost:
        r28.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x080b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0829, code lost:
        if (r1.contains("No space") == false) goto L_0x082b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x019d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a1, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x0240 */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x024e A[SYNTHETIC, Splitter:B:162:0x024e] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02fc A[Catch:{ IllegalArgumentException -> 0x084f }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0327 A[SYNTHETIC, Splitter:B:201:0x0327] */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x068c A[Catch:{ all -> 0x076e }] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0691 A[Catch:{ all -> 0x076e }] */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x06dd A[SYNTHETIC, Splitter:B:374:0x06dd] */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x0822  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x082e  */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x0837  */
    /* JADX WARNING: Removed duplicated region for block: B:484:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(java.lang.Object[] r34) {
        /*
        // Method dump skipped, instructions count: 2248
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2ZE.A02(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        String A0E;
        Pair pair = (Pair) obj;
        if (pair != null) {
            Intent intent = (Intent) pair.first;
            int intValue = ((Number) pair.second).intValue();
            if (intValue == 0) {
                AbstractC004502c r5 = (AbstractC004502c) this.A07.get();
                Context context = (Context) this.A06.get();
                if (intent == null || r5 == null || context == null) {
                    boolean z = this.A08;
                    int i = R.string.export_conversation_failed;
                    if (z) {
                        i = R.string.export_conversation_with_media_failed;
                    }
                    A04(i);
                    return;
                }
                r5.AMi();
                this.A00.A01(intent, context, r5, this.A03.A06(R.string.send_conversation_via), false);
            } else if (intValue == 1) {
                AbstractC004502c r4 = (AbstractC004502c) this.A07.get();
                if (r4 != null) {
                    r4.AMi();
                    if (AnonymousClass00C.A01()) {
                        StringBuilder sb = new StringBuilder();
                        AnonymousClass01X r1 = this.A03;
                        AnonymousClass008.A0o(r1, R.string.export_conversation_failed_out_of_space, sb, " ");
                        A0E = AnonymousClass008.A0E(r1, R.string.remove_files_from_sd_card, sb);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        AnonymousClass01X r12 = this.A03;
                        AnonymousClass008.A0o(r12, R.string.export_conversation_failed_out_of_space_shared_storage, sb2, " ");
                        A0E = AnonymousClass008.A0E(r12, R.string.remove_files_from_shared_storage, sb2);
                    }
                    r4.APr(A0E);
                }
            } else if (intValue == 3) {
                boolean z2 = this.A08;
                int i2 = R.string.export_conversation_failed;
                if (z2) {
                    i2 = R.string.export_conversation_with_media_failed;
                }
                A04(i2);
            } else if (intValue != 4) {
                A04(R.string.export_conversation_failed);
            } else {
                A04(R.string.export_conversation_failed_messages_are_uploading);
            }
        }
    }

    public final void A04(int i) {
        AbstractC004502c r0 = (AbstractC004502c) this.A07.get();
        if (r0 != null) {
            r0.AMi();
            r0.APo(i);
        }
    }
}
