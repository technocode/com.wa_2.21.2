package X;

/* renamed from: X.2jl  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractRunnableC57132jl implements Runnable, AbstractC27381Pn {
    public final AnonymousClass2TS A00;

    public AbstractRunnableC57132jl(AnonymousClass2TS r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01d2, code lost:
        if (r1 != null) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01d7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x040c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/libmp4muxexception", r2);
        r1 = new java.lang.StringBuilder();
        r1.append("Mp4OpsFail (");
        r1.append(r2.errorCode);
        r1.append(")");
        r4.A0N = r1.toString();
        ((X.AnonymousClass2TS) r8).A03.A00(com.google.android.search.verification.client.R.string.error_bad_gif);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0434, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0437, code lost:
        if (r6 != null) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x043d, code lost:
        if (r6.isHeld() != false) goto L_0x0537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0441, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0442, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/ioexception", r2);
        r1 = new java.lang.StringBuilder();
        r1.append("IOException: ");
        r1.append(r2.getMessage());
        r4.A0N = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0470, code lost:
        ((X.AnonymousClass2TS) r8).A03.A00(com.google.android.search.verification.client.R.string.error_no_disc_space);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x047a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x047b, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/filenotfound", r2);
        r1 = new java.lang.StringBuilder();
        r1.append("FileNotFoundException: ");
        r1.append(r2.getMessage());
        r4.A0N = r1.toString();
        ((X.AnonymousClass2TS) r8).A03.A00(com.google.android.search.verification.client.R.string.error_load_gif);
        com.whatsapp.VideoFrameConverter.setLogFilePath(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04a2, code lost:
        if (r6 != null) goto L_0x04a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04a8, code lost:
        if (r6.isHeld() != false) goto L_0x0537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04ac, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04ad, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/bad video", r1);
        r4.A0N = "BadVideoException";
        ((X.AnonymousClass2TS) r8).A03.A00(com.google.android.search.verification.client.R.string.error_bad_gif);
        com.whatsapp.VideoFrameConverter.setLogFilePath(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04c1, code lost:
        if (r6 != null) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04c7, code lost:
        if (r6.isHeld() != false) goto L_0x0537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04ca, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04cb, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/illegalargument", r2);
        r1 = new java.lang.StringBuilder();
        r1.append("IllegalArgumentException: ");
        r1.append(r2.getMessage());
        r4.A0N = r1.toString();
        ((X.AnonymousClass2TS) r8).A03.A00(com.google.android.search.verification.client.R.string.error_processing_gif);
        com.whatsapp.VideoFrameConverter.setLogFilePath(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04f2, code lost:
        if (r6 != null) goto L_0x04f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04f8, code lost:
        if (r6.isHeld() != false) goto L_0x0537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04fb, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04fc, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/illegalstate", r2);
        r1 = new java.lang.StringBuilder();
        r1.append("IllegalStateException: ");
        r1.append(r2.getMessage());
        r4.A0N = r1.toString();
        ((X.AnonymousClass2TS) r8).A03.A00(com.google.android.search.verification.client.R.string.error_processing_gif);
        com.whatsapp.VideoFrameConverter.setLogFilePath(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0523, code lost:
        if (r6 != null) goto L_0x0525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0529, code lost:
        if (r6.isHeld() != false) goto L_0x0537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x052c, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x052f, code lost:
        if (r6 != null) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0535, code lost:
        if (r6.isHeld() != false) goto L_0x0537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0537, code lost:
        r6.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x053a, code lost:
        r9.A0D.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x059f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05a0, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05ab, code lost:
        r6.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05ae, code lost:
        r9.A0D.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05b3, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05cb, code lost:
        if (r14.exists() == false) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0661, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0665, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06d4, code lost:
        if (r11 != null) goto L_0x06d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06d9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/libmp4muxexception", r1);
        r2.A03.A00(com.google.android.search.verification.client.R.string.error_bad_media);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00da, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00df, code lost:
        if (r1.getMessage() == null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ed, code lost:
        r2.A03.A00(com.google.android.search.verification.client.R.string.error_no_disc_space);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f6, code lost:
        r2.A03.A00(com.google.android.search.verification.client.R.string.error_processing_audio);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fe, code lost:
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0100, code lost:
        if (r1 != null) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0106, code lost:
        if (r1.isHeld() != false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0109, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010a, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/filenotfound", r1);
        r2.A03.A00(com.google.android.search.verification.client.R.string.error_load_audio);
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0119, code lost:
        if (r1 != null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011f, code lost:
        if (r1.isHeld() != false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0122, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0123, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/badaudio", r1);
        r2.A03.A00(com.google.android.search.verification.client.R.string.error_bad_media);
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0132, code lost:
        if (r1 != null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0138, code lost:
        if (r1.isHeld() != false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013c, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/illegalstate", r1);
        r2.A03.A00(com.google.android.search.verification.client.R.string.error_processing_audio);
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014b, code lost:
        if (r1 != null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0151, code lost:
        if (r1.isHeld() != false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0154, code lost:
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0156, code lost:
        if (r1 != null) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015c, code lost:
        if (r1.isHeld() != false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015e, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0161, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0183, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0184, code lost:
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x018e, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0191, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0441 A[ExcHandler: IOException (r2v15 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:144:0x02ef] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x047a A[ExcHandler: FileNotFoundException (r2v14 'e' java.io.FileNotFoundException A[CUSTOM_DECLARE]), Splitter:B:144:0x02ef] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x04ac A[ExcHandler: 3SE (r1v27 'e' X.3SE A[CUSTOM_DECLARE]), Splitter:B:144:0x02ef] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x04ca A[ExcHandler: IllegalArgumentException (r2v13 'e' java.lang.IllegalArgumentException A[CUSTOM_DECLARE]), Splitter:B:144:0x02ef] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x04fb A[ExcHandler: IllegalStateException (r2v12 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE]), Splitter:B:144:0x02ef] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0560  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x05dc  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0700  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0709  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00da A[ExcHandler: IOException (r1v69 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:7:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0109 A[ExcHandler: FileNotFoundException (r1v66 'e' java.io.FileNotFoundException A[CUSTOM_DECLARE]), Splitter:B:7:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0122 A[ExcHandler: 3SD (r1v63 'e' X.3SD A[CUSTOM_DECLARE]), Splitter:B:7:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013b A[ExcHandler: IllegalStateException (r1v60 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE]), Splitter:B:7:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2TV A00() {
        /*
        // Method dump skipped, instructions count: 1933
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractRunnableC57132jl.A00():X.2TV");
    }

    @Override // X.AbstractC27381Pn
    public synchronized void cancel() {
        AnonymousClass0JH r0;
        AnonymousClass2TS r1 = this.A00;
        synchronized (r1) {
            r0 = r1.A00;
        }
        if (r0 != null) {
            r0.cancel();
        }
    }

    public void run() {
        this.A00.A05.AGC(A00());
    }
}
