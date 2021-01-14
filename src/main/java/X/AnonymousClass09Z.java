package X;

import android.database.Cursor;
import java.io.File;

/* renamed from: X.09Z  reason: invalid class name */
public class AnonymousClass09Z {
    public static volatile AnonymousClass09Z A06;
    public final AnonymousClass03R A00;
    public final C014408c A01;
    public final C014508d A02;
    public final C015408m A03;
    public final AnonymousClass096 A04;
    public final C015708p A05;

    public AnonymousClass09Z(C014408c r1, AnonymousClass03R r2, C015408m r3, C015708p r4, C014508d r5, AnonymousClass096 r6) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A02 = r5;
        this.A04 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0M4 A00(byte[] r5, java.lang.String r6) {
        /*
            r4 = 0
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0043, ClassNotFoundException -> 0x0041 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0043, ClassNotFoundException -> 0x0041 }
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0043, ClassNotFoundException -> 0x0041 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0043, ClassNotFoundException -> 0x0041 }
            java.lang.Object r2 = r3.readObject()     // Catch:{ all -> 0x003a }
            boolean r0 = r2 instanceof com.whatsapp.MediaData     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0030
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r1.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "Unexpected type of media data ("
            r1.append(r0)     // Catch:{ all -> 0x003a }
            r1.append(r2)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = " )"
            r1.append(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x003a }
            com.whatsapp.util.Log.e(r0)     // Catch:{ all -> 0x003a }
            r3.close()
            return r4
        L_0x0030:
            com.whatsapp.MediaData r2 = (com.whatsapp.MediaData) r2
            X.0M4 r0 = X.AnonymousClass0M4.A00(r2)
            r3.close()
            return r0
        L_0x003a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0
        L_0x0041:
            r2 = move-exception
            goto L_0x0044
        L_0x0043:
            r2 = move-exception
        L_0x0044:
            java.lang.String r1 = "failure fetching media data by hash; hash="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Z.A00(byte[], java.lang.String):X.0M4");
    }

    public static AnonymousClass09Z A01() {
        if (A06 == null) {
            synchronized (AnonymousClass09Z.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass09Z(C014408c.A00(), AnonymousClass03R.A00(), C015408m.A00(), C015708p.A00(), C014508d.A00(), AnonymousClass096.A00());
                }
            }
        }
        return A06;
    }

    public static AnonymousClass0PN A02(AnonymousClass0PQ r5) {
        return new C43571yb(r5.A0A, r5.A0Z, r5.A0h, r5.A0N, r5);
    }

    public static final void A03(AnonymousClass1VB r6, long j, long j2, String str, String str2, String str3, long j3, String str4, String str5, Integer num, int i, String str6, boolean z, String str7) {
        r6.A06(1, j);
        r6.A06(2, j2);
        if (str == null) {
            r6.A04(4);
        } else {
            r6.A07(4, str);
        }
        if (str2 == null) {
            r6.A04(25);
        } else {
            r6.A07(25, str2);
        }
        if (str3 == null) {
            r6.A04(26);
        } else {
            r6.A07(26, str3);
        }
        r6.A06(27, j3);
        if (str4 == null) {
            r6.A04(28);
        } else {
            r6.A07(28, str4);
        }
        if (str5 == null) {
            r6.A04(29);
        } else {
            r6.A07(29, str5);
        }
        long j4 = 0;
        if (num != null) {
            r6.A06(31, (long) num.intValue());
            r6.A06(30, 0);
        } else {
            r6.A06(31, 0);
            r6.A06(30, (long) i);
        }
        if (str6 == null) {
            r6.A04(32);
        } else {
            r6.A07(32, str6);
        }
        if (z) {
            j4 = 1;
        }
        r6.A06(35, j4);
        if (str7 == null) {
            r6.A04(36);
        } else {
            r6.A07(36, str7);
        }
    }

    public AnonymousClass0M4 A04(Cursor cursor) {
        AnonymousClass0M4 r2 = new AnonymousClass0M4();
        r2.A0L = AnonymousClass09R.A03(cursor, cursor.getColumnIndexOrThrow("autotransfer_retry_enabled"));
        r2.A0I = cursor.getString(cursor.getColumnIndexOrThrow("media_job_uuid"));
        r2.A0P = AnonymousClass09R.A03(cursor, cursor.getColumnIndexOrThrow("transferred"));
        r2.A0O = AnonymousClass09R.A03(cursor, cursor.getColumnIndexOrThrow("transcoded"));
        r2.A0A = cursor.getLong(cursor.getColumnIndexOrThrow("file_size"));
        r2.A07 = cursor.getInt(cursor.getColumnIndexOrThrow("suspicious_content"));
        r2.A0D = cursor.getLong(cursor.getColumnIndexOrThrow("trim_from"));
        r2.A0E = cursor.getLong(cursor.getColumnIndexOrThrow("trim_to"));
        r2.A02 = cursor.getInt(cursor.getColumnIndexOrThrow("face_x"));
        r2.A03 = cursor.getInt(cursor.getColumnIndexOrThrow("face_y"));
        r2.A0U = cursor.getBlob(cursor.getColumnIndexOrThrow("media_key"));
        r2.A0B = cursor.getLong(cursor.getColumnIndexOrThrow("media_key_timestamp"));
        r2.A08 = cursor.getInt(cursor.getColumnIndexOrThrow("width"));
        r2.A06 = cursor.getInt(cursor.getColumnIndexOrThrow("height"));
        r2.A0M = AnonymousClass09R.A03(cursor, cursor.getColumnIndexOrThrow("has_streaming_sidecar"));
        r2.A05 = cursor.getInt(cursor.getColumnIndexOrThrow("gif_attribution"));
        r2.A00 = cursor.getFloat(cursor.getColumnIndexOrThrow("thumbnail_height_width_ratio"));
        r2.A0G = cursor.getString(cursor.getColumnIndexOrThrow("direct_path"));
        r2.A0R = cursor.getBlob(cursor.getColumnIndexOrThrow("first_scan_sidecar"));
        r2.A04 = cursor.getInt(cursor.getColumnIndexOrThrow("first_scan_length"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("file_path"));
        r2.A0K = cursor.getString(cursor.getColumnIndexOrThrow("partial_media_hash"));
        r2.A0J = cursor.getString(cursor.getColumnIndexOrThrow("partial_media_enc_hash"));
        r2.A0N = AnonymousClass09R.A03(cursor, cursor.getColumnIndexOrThrow("mute_video"));
        r2.A0F = A07(string);
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0053, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0M4 A05(byte[] r6) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Z.A05(byte[]):X.0M4");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        if (X.AnonymousClass1VY.A0Y(r19) != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01da, code lost:
        if (r5 != null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01df, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e6, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010b A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0178 A[Catch:{ all -> 0x01d9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C28481Um A06(X.AnonymousClass02N r19) {
        /*
        // Method dump skipped, instructions count: 488
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Z.A06(X.02N):X.1Um");
    }

    public final File A07(String str) {
        File file;
        if (str == null) {
            file = null;
        } else {
            file = new File(str);
        }
        return this.A00.A04(file);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(long r19, X.AnonymousClass0M4 r21) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Z.A08(long, X.0M4):void");
    }

    public final void A09(long j, AnonymousClass0M3 r14, AnonymousClass1VB r15) {
        int i;
        Integer num;
        byte[] bArr = null;
        if (r14 instanceof AnonymousClass0M2) {
            num = Integer.valueOf(((AnonymousClass0M2) r14).A00);
            i = 0;
        } else {
            i = r14.A00;
            num = null;
        }
        C05440On A0B = r14.A0B();
        if (A0B != null) {
            bArr = A0B.A08();
        }
        String str = r14.A09;
        String str2 = r14.A07;
        long j2 = r14.A01;
        String A0w = r14.A0w();
        String str3 = r14.A06;
        String str4 = r14.A05;
        r15.A06(1, j);
        if (str == null) {
            r15.A04(11);
        } else {
            r15.A07(11, str);
        }
        if (str2 == null) {
            r15.A04(12);
        } else {
            r15.A07(12, str2);
        }
        r15.A06(13, j2);
        if (A0w == null) {
            r15.A04(14);
        } else {
            r15.A07(14, A0w);
        }
        if (str3 == null) {
            r15.A04(15);
        } else {
            r15.A07(15, str3);
        }
        long j3 = 0;
        if (num != null) {
            r15.A06(17, (long) num.intValue());
            r15.A06(16, 0);
        } else {
            r15.A06(17, 0);
            r15.A06(16, (long) i);
        }
        if (str4 == null) {
            r15.A04(18);
        } else {
            r15.A07(18, str4);
        }
        if (bArr == null) {
            r15.A04(19);
        } else {
            r15.A08(19, bArr);
        }
        AnonymousClass0M4 r4 = r14.A02;
        if (r4 != null) {
            String str5 = r4.A0I;
            if (str5 == null) {
                r15.A04(2);
            } else {
                r15.A07(2, str5);
            }
            if (r4.A0P) {
                j3 = 1;
            }
            r15.A06(3, j3);
            r15.A06(5, r4.A0A);
            byte[] bArr2 = r4.A0U;
            if (bArr2 == null) {
                r15.A04(6);
            } else {
                r15.A08(6, bArr2);
            }
            r15.A06(7, r4.A0B);
            r15.A06(8, (long) r4.A08);
            r15.A06(9, (long) r4.A06);
            String str6 = r4.A0G;
            if (str6 == null) {
                r15.A04(10);
            } else {
                r15.A07(10, str6);
            }
            File file = r4.A0F;
            if (file != null) {
                r15.A07(4, this.A00.A05(file));
            } else {
                r15.A04(4);
            }
        }
    }

    public void A0A(AnonymousClass0M4 r7, AnonymousClass1VB r8) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5 = 1;
        if (r7.A0L) {
            j = 1;
        } else {
            j = 0;
        }
        r8.A06(3, j);
        String str = r7.A0I;
        if (str == null) {
            r8.A04(5);
        } else {
            r8.A07(5, str);
        }
        if (r7.A0P) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        r8.A06(6, j2);
        if (r7.A0O) {
            j3 = 1;
        } else {
            j3 = 0;
        }
        r8.A06(7, j3);
        r8.A06(9, r7.A0A);
        r8.A06(10, (long) r7.A07);
        r8.A06(11, r7.A0D);
        r8.A06(12, r7.A0E);
        r8.A06(13, (long) r7.A02);
        r8.A06(14, (long) r7.A03);
        byte[] bArr = r7.A0U;
        if (bArr == null) {
            r8.A04(15);
        } else {
            r8.A08(15, bArr);
        }
        r8.A06(16, r7.A0B);
        r8.A06(17, (long) r7.A08);
        r8.A06(18, (long) r7.A06);
        if (r7.A0M) {
            j4 = 1;
        } else {
            j4 = 0;
        }
        r8.A06(19, j4);
        r8.A06(20, (long) r7.A05);
        r8.A05(21, (double) r7.A00);
        String str2 = r7.A0G;
        if (str2 == null) {
            r8.A04(22);
        } else {
            r8.A07(22, str2);
        }
        byte[] bArr2 = r7.A0R;
        if (bArr2 == null) {
            r8.A04(23);
        } else {
            r8.A08(23, bArr2);
        }
        r8.A06(24, (long) r7.A04);
        File file = r7.A0F;
        if (file != null) {
            r8.A07(8, this.A00.A05(file));
        } else {
            r8.A04(8);
        }
        String str3 = r7.A0K;
        if (str3 == null) {
            r8.A04(33);
        } else {
            r8.A07(33, str3);
        }
        String str4 = r7.A0J;
        if (str4 == null) {
            r8.A04(34);
        } else {
            r8.A07(34, str4);
        }
        if (!r7.A0N) {
            j5 = 0;
        }
        r8.A06(37, j5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bb, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.AbstractC007503q r12) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Z.A0B(X.03q):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0109, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010a, code lost:
        if (r14 != null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0121, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0122, code lost:
        if (r6 != null) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0127, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0138, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0139, code lost:
        if (r7 != null) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0141, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0145, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.AnonymousClass0M3 r28) {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Z.A0C(X.0M3):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.AnonymousClass0M3 r8, long r9) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Z.A0D(X.0M3, long):void");
    }

    public final void A0E(AnonymousClass0M3 r21, AnonymousClass1VB r22) {
        int A022;
        AnonymousClass0M4 r1 = r21.A02;
        if (r1 != null) {
            A0A(r1, r22);
        }
        long j = r21.A0p;
        C014408c r2 = this.A01;
        AnonymousClass02N r12 = r21.A0n.A00;
        if (r12 != null) {
            long A052 = r2.A05(r12);
            String str = r21.A0A;
            String str2 = r21.A09;
            String str3 = r21.A07;
            long j2 = r21.A01;
            String A0w = r21.A0w();
            String str4 = r21.A06;
            Integer num = null;
            boolean z = false;
            if (r21 instanceof AnonymousClass0M2) {
                num = Integer.valueOf(((AnonymousClass0M2) r21).A00);
                A022 = 0;
            } else {
                A022 = r21.A02();
            }
            String str5 = r21.A05;
            if ((r21 instanceof AnonymousClass0ZE) && ((AnonymousClass0ZE) r21).A00) {
                z = true;
            }
            A03(r22, j, A052, str, str2, str3, j2, A0w, str4, num, A022, str5, z, r21.A0B);
            return;
        }
        throw null;
    }

    public boolean A0F() {
        String A012;
        if (!this.A01.A0G() || (A012 = this.A03.A01("media_message_ready")) == null || Integer.parseInt(A012) != 2) {
            return false;
        }
        return true;
    }
}
