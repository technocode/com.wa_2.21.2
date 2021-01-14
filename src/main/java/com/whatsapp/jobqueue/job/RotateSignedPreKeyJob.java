package com.whatsapp.jobqueue.job;

import X.AnonymousClass008;
import X.AnonymousClass09H;
import X.AnonymousClass0EA;
import X.AnonymousClass0I1;
import X.AnonymousClass1WK;
import X.AnonymousClass1XQ;
import X.C001000o;
import X.C001400w;
import X.C03250Fl;
import X.C05360Of;
import X.C55552gr;
import X.CallableC49632Rk;
import android.content.Context;
import android.os.Message;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.whispersystems.jobqueue.Job;

public final class RotateSignedPreKeyJob extends Job implements AnonymousClass0EA {
    public static final long serialVersionUID = 1;
    public transient C03250Fl A00;
    public transient C001000o A01;
    public transient C001400w A02;
    public transient AnonymousClass09H A03;
    public final byte[] data;
    public final byte[] id;
    public final byte[] signature;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RotateSignedPreKeyJob(byte[] r5, byte[] r6, byte[] r7) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.RotateSignedPreKeyJob.<init>(byte[], byte[], byte[]):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0S = AnonymousClass008.A0S("starting rotate signed pre key job");
        A0S.append(A05());
        Log.i(A0S.toString());
        C001400w r0 = this.A02;
        if (!Arrays.equals(this.id, ((AnonymousClass1XQ) r0.A00.submit(new CallableC49632Rk(this)).get()).A01)) {
            StringBuilder A0S2 = AnonymousClass008.A0S("aborting rotate signed pre key job due to id mismatch with latest");
            A0S2.append(A05());
            Log.w(A0S2.toString());
            return;
        }
        String A022 = this.A03.A02();
        AtomicInteger atomicInteger = new AtomicInteger();
        AtomicReference atomicReference = new AtomicReference();
        AnonymousClass09H r7 = this.A03;
        AnonymousClass1XQ r6 = new AnonymousClass1XQ(this.id, this.data, this.signature);
        Message obtain = Message.obtain(null, 0, 86, 0, new C55552gr(this, atomicInteger, atomicReference));
        obtain.getData().putString("iqId", A022);
        obtain.getData().putParcelable("signedPreKey", new AnonymousClass1WK(r6));
        ((AnonymousClass0I1) r7.A05(A022, obtain, false)).get();
        int i = atomicInteger.get();
        if (i == 503) {
            StringBuilder A0S3 = AnonymousClass008.A0S("server 503 error during rotate signed pre key job");
            A0S3.append(A05());
            throw new Exception(A0S3.toString());
        } else if (i == 409) {
            StringBuilder sb = new StringBuilder();
            sb.append("server error code returned during rotate signed pre key job; errorCode=");
            sb.append(i);
            sb.append(A05());
            Log.w(sb.toString());
            Object obj = atomicReference.get();
            if (obj != null) {
                C001400w r2 = this.A02;
                r2.A00.submit(new RunnableEBaseShape8S0200000_I1_3(this, obj, 19));
            }
        } else if (i != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("server error code returned during rotate signed pre key job; errorCode=");
            sb2.append(i);
            sb2.append(A05());
            Log.w(sb2.toString());
        }
    }

    public final String A05() {
        StringBuilder A0S = AnonymousClass008.A0S("; signedPreKeyId=");
        A0S.append(C05360Of.A01(this.id));
        A0S.append("; persistentId=");
        A0S.append(super.A01);
        return A0S.toString();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A03 = AnonymousClass09H.A01();
        this.A02 = C001400w.A02;
        this.A00 = C03250Fl.A00();
        this.A01 = C001000o.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        byte[] bArr = this.id;
        if (bArr != null) {
            byte[] bArr2 = this.data;
            if (bArr2 != null) {
                byte[] bArr3 = this.signature;
                if (bArr3 != null) {
                    int length = bArr.length;
                    if (length == 3) {
                        int length2 = bArr2.length;
                        if (length2 == 32) {
                            int length3 = bArr3.length;
                            if (length3 != 64) {
                                StringBuilder A0S = AnonymousClass008.A0S("invalid signed pre-key signature length: ");
                                A0S.append(length3);
                                throw new InvalidObjectException(A0S.toString());
                            }
                            return;
                        }
                        StringBuilder A0S2 = AnonymousClass008.A0S("invalid signed pre-key length: ");
                        A0S2.append(length2);
                        throw new InvalidObjectException(A0S2.toString());
                    }
                    StringBuilder A0S3 = AnonymousClass008.A0S("invalid signed pre-key id length: ");
                    A0S3.append(length);
                    throw new InvalidObjectException(A0S3.toString());
                }
                throw new InvalidObjectException("signature cannot be null");
            }
            throw new InvalidObjectException("data cannot be null");
        }
        throw new InvalidObjectException("id cannot be null");
    }
}
