package X;

import java.io.File;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0BV  reason: invalid class name */
public class AnonymousClass0BV {
    public static volatile AnonymousClass0BV A0G;
    public final AnonymousClass009 A00;
    public final AnonymousClass088 A01;
    public final C000300f A02;
    public final AnonymousClass03R A03;
    public final AnonymousClass00G A04;
    public final AnonymousClass09V A05;
    public final C014408c A06;
    public final AnonymousClass01K A07;
    public final AnonymousClass09Z A08;
    public final AnonymousClass0B4 A09;
    public final C014608e A0A;
    public final AnonymousClass094 A0B;
    public final C014508d A0C;
    public final AnonymousClass095 A0D;
    public final AnonymousClass096 A0E;
    public final AnonymousClass022 A0F;

    public AnonymousClass0BV(C014408c r2, AnonymousClass00G r3, AnonymousClass009 r4, AnonymousClass088 r5, AnonymousClass095 r6, AnonymousClass03R r7, C000300f r8, AnonymousClass0B4 r9, AnonymousClass01K r10, AnonymousClass09V r11, C014608e r12, C014508d r13, AnonymousClass096 r14, AnonymousClass09Z r15, AnonymousClass022 r16, AnonymousClass094 r17) {
        this.A06 = r2;
        this.A04 = r3;
        this.A00 = r4;
        this.A01 = r5;
        this.A0D = r6;
        this.A03 = r7;
        this.A02 = r8;
        this.A09 = r9;
        this.A07 = r10;
        this.A05 = r11;
        this.A0A = r12;
        this.A0C = r13;
        this.A0E = r14;
        this.A08 = r15;
        this.A0F = r16;
        this.A0B = r17;
    }

    public static AnonymousClass0BV A00() {
        if (A0G == null) {
            synchronized (AnonymousClass0BV.class) {
                if (A0G == null) {
                    C014408c A002 = C014408c.A00();
                    AnonymousClass00G r4 = AnonymousClass00G.A01;
                    AnonymousClass009 A003 = AnonymousClass009.A00();
                    C002101e.A00();
                    A0G = new AnonymousClass0BV(A002, r4, A003, AnonymousClass088.A00(), AnonymousClass095.A00(), AnonymousClass03R.A00(), C000300f.A00(), AnonymousClass0B4.A00(), AnonymousClass01K.A00(), AnonymousClass09V.A00(), C014608e.A01, C014508d.A00(), AnonymousClass096.A00(), AnonymousClass09Z.A01(), AnonymousClass022.A00(), AnonymousClass094.A00());
                }
            }
        }
        return A0G;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bd, code lost:
        if (r5 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(X.AnonymousClass02N r9, X.AbstractC11180fq r10, int r11) {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BV.A01(X.02N, X.0fq, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor A02(X.AnonymousClass02N r8, byte r9) {
        /*
            r7 = this;
            java.lang.String r0 = "mediamsgstore/getMediaMessagesByTypeCursor:"
            X.AnonymousClass008.A11(r0, r8)
            X.08d r0 = r7.A0C
            X.0OQ r4 = r0.A03()
            X.0BK r6 = r4.A04     // Catch:{ all -> 0x0030 }
            java.lang.String r5 = X.AbstractC05370Og.A0X     // Catch:{ all -> 0x0030 }
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0030 }
            r2 = 0
            X.08c r0 = r7.A06     // Catch:{ all -> 0x0030 }
            long r0 = r0.A05(r8)     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0030 }
            r3[r2] = r0     // Catch:{ all -> 0x0030 }
            r1 = 1
            java.lang.String r0 = java.lang.Byte.toString(r9)     // Catch:{ all -> 0x0030 }
            r3[r1] = r0     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = "GET_MEDIA_MESSAGES_BY_TYPE_SQL"
            android.database.Cursor r0 = r6.A07(r5, r3, r0)     // Catch:{ all -> 0x0030 }
            r4.close()
            return r0
        L_0x0030:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BV.A02(X.02N, byte):android.database.Cursor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor A03(X.AnonymousClass02N r10, long r11) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BV.A03(X.02N, long):android.database.Cursor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor A04(X.AnonymousClass02N r10, long r11) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BV.A04(X.02N, long):android.database.Cursor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor A05(X.AnonymousClass02N r9, long r10) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BV.A05(X.02N, long):android.database.Cursor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor A06(X.AnonymousClass02N r9, long r10, int r12) {
        /*
            r8 = this;
            java.lang.String r0 = "mediamsgstore/getMediaMessagesHeadCursor:"
            X.AnonymousClass008.A12(r0, r9)
            X.08d r0 = r8.A0C
            X.0OQ r4 = r0.A03()
            r7 = 1
            java.lang.String r0 = X.AbstractC05370Og.A0b     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r1.<init>(r0)     // Catch:{ all -> 0x0046 }
            X.AnonymousClass096.A03(r7, r1)     // Catch:{ all -> 0x0046 }
            if (r12 <= 0) goto L_0x0020
            java.lang.String r0 = " LIMIT "
            r1.append(r0)     // Catch:{ all -> 0x0046 }
            r1.append(r12)     // Catch:{ all -> 0x0046 }
        L_0x0020:
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x0046 }
            X.0BK r5 = r4.A04     // Catch:{ all -> 0x0046 }
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0046 }
            r2 = 0
            X.08c r0 = r8.A06     // Catch:{ all -> 0x0046 }
            long r0 = r0.A05(r9)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0046 }
            r3[r2] = r0     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0046 }
            r3[r7] = r0     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "GET_MEDIA_MESSAGES_HEAD_CURSOR"
            android.database.Cursor r0 = r5.A07(r6, r3, r0)     // Catch:{ all -> 0x0046 }
            r4.close()
            return r0
        L_0x0046:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BV.A06(X.02N, long, int):android.database.Cursor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor A07(X.AnonymousClass02N r8, long r9, int r11) {
        /*
            r7 = this;
            java.lang.String r0 = "mediamsgstore/getMediaMessagesTailCursor:"
            X.AnonymousClass008.A12(r0, r8)
            X.08d r0 = r7.A0C
            X.0OQ r3 = r0.A03()
            r6 = 0
            java.lang.String r0 = X.AbstractC05370Og.A0b     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r1.<init>(r0)     // Catch:{ all -> 0x0046 }
            X.AnonymousClass096.A03(r6, r1)     // Catch:{ all -> 0x0046 }
            if (r11 <= 0) goto L_0x0020
            java.lang.String r0 = " LIMIT "
            r1.append(r0)     // Catch:{ all -> 0x0046 }
            r1.append(r11)     // Catch:{ all -> 0x0046 }
        L_0x0020:
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x0046 }
            X.0BK r4 = r3.A04     // Catch:{ all -> 0x0046 }
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0046 }
            X.08c r0 = r7.A06     // Catch:{ all -> 0x0046 }
            long r0 = r0.A05(r8)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0046 }
            r2[r6] = r0     // Catch:{ all -> 0x0046 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0046 }
            r2[r1] = r0     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "GET_MEDIA_MESSAGES_TAIL_CURSOR"
            android.database.Cursor r0 = r4.A07(r5, r2, r0)     // Catch:{ all -> 0x0046 }
            r3.close()
            return r0
        L_0x0046:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BV.A07(X.02N, long, int):android.database.Cursor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0082, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor A08(X.AnonymousClass02N r8, java.lang.Byte[] r9) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BV.A08(X.02N, java.lang.Byte[]):android.database.Cursor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0116, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C47952Ki A09(java.lang.String r22, byte r23, boolean r24) {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BV.A09(java.lang.String, byte, boolean):X.2Ki");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0M3 A0A(java.lang.String r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 != 0) goto L_0x0004
            return r5
        L_0x0004:
            X.08d r0 = r6.A0C
            X.0OQ r4 = r0.A03()
            X.0BK r3 = r4.A04     // Catch:{ all -> 0x004f }
            java.lang.String r2 = "SELECT message_row_id, chat_row_id, autotransfer_retry_enabled, multicast_id, media_job_uuid, transferred, transcoded, file_path, file_size, suspicious_content, trim_from, trim_to, face_x, face_y, media_key, media_key_timestamp, width, height, has_streaming_sidecar, gif_attribution, thumbnail_height_width_ratio, direct_path, first_scan_sidecar, first_scan_length, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, partial_media_hash, partial_media_enc_hash, is_animated_sticker, original_file_hash, mute_video FROM message_media WHERE original_file_hash=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x004f }
            r0 = 0
            r1[r0] = r7     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "SELECT_ORIGINAL_MESSAGE_FROM_ORIGINAL_FILE_HASH"
            android.database.Cursor r3 = r3.A07(r2, r1, r0)     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x0046
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "message_row_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003f }
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x003f }
            X.09V r0 = r6.A05     // Catch:{ all -> 0x003f }
            X.03q r1 = r0.A01(r1)     // Catch:{ all -> 0x003f }
            boolean r0 = r1 instanceof X.AnonymousClass0M3     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0046
            X.0M3 r1 = (X.AnonymousClass0M3) r1     // Catch:{ all -> 0x003f }
            r3.close()
            r4.close()
            return r1
        L_0x003f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0
        L_0x0046:
            if (r3 == 0) goto L_0x004b
            r3.close()
        L_0x004b:
            r4.close()
            return r5
        L_0x004f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BV.A0A(java.lang.String):X.0M3");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        if (r5 != null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ca, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0B(X.AnonymousClass02N r11, int r12, X.AbstractC11180fq r13, int r14) {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BV.A0B(X.02N, int, X.0fq, int):java.util.ArrayList");
    }

    public Collection A0C(File file, String str, C04080Iy r7) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractCollection) A0E(str, (byte) 0, r7)).iterator();
        while (it.hasNext()) {
            AnonymousClass0M3 r1 = (AnonymousClass0M3) it.next();
            AnonymousClass0M4 r0 = r1.A02;
            if (r0 != null && file.equals(r0.A0F)) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public Collection A0D(String str, byte b) {
        File file;
        AbstractCollection abstractCollection = (AbstractCollection) A0E(str, b, null);
        ArrayList arrayList = new ArrayList(abstractCollection.size());
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            AnonymousClass0M3 r2 = (AnonymousClass0M3) it.next();
            AnonymousClass0M4 r1 = r2.A02;
            if (r1 != null && r1.A0P && (file = r1.A0F) != null && file.exists()) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        ((android.database.CursorWrapper) r2).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0088, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection A0E(java.lang.String r8, byte r9, X.C04080Iy r10) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BV.A0E(java.lang.String, byte, X.0Iy):java.util.Collection");
    }

    public final String[] A0F(AnonymousClass02N r5, long j) {
        ArrayList arrayList = new ArrayList();
        if (r5 != null) {
            arrayList.add(String.valueOf(this.A06.A05(r5)));
        }
        if (j > 0) {
            arrayList.add(String.valueOf(j));
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
