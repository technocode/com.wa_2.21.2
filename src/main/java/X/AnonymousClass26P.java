package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.SystemClock;

/* renamed from: X.26P  reason: invalid class name */
public final class AnonymousClass26P extends AbstractC35671kk {
    public long A00 = Long.MIN_VALUE;
    public long A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass26M A04;
    public final AnonymousClass26N A05;
    public final AnonymousClass1A3 A06;
    public final AnonymousClass1A3 A07;
    public final AnonymousClass1AC A08;
    public final AnonymousClass26V A09;
    public final AnonymousClass1AI A0A;

    public AnonymousClass26P(C242819u r3, AnonymousClass19w r4) {
        super(r3);
        C001801b.A1Q(r4);
        this.A08 = new AnonymousClass1AC(r3);
        this.A05 = new AnonymousClass26N(r3);
        this.A09 = new AnonymousClass26V(r3);
        this.A04 = new AnonymousClass26M(r3);
        this.A0A = new AnonymousClass1AI(((C242619s) this).A00.A03);
        this.A06 = new C35691km(this, r3);
        this.A07 = new C35701kn(this, r3);
    }

    public final long A0D() {
        long longValue = ((Number) AnonymousClass1A5.A0D.A00).longValue();
        AnonymousClass26X r1 = ((C242619s) this).A00.A09;
        C242819u.A01(r1);
        r1.A0C();
        if (!r1.A03) {
            return longValue;
        }
        C242819u.A01(r1);
        r1.A0C();
        return ((long) r1.A00) * 1000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[LOOP:1: B:15:0x0050->B:23:?, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E() {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26P.A0E():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b7, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b9, code lost:
        r6.A00 = r1;
        r6.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F() {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26P.A0F():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        if (r1 == false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G() {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26P.A0G():void");
    }

    public final void A0H() {
        C242819u r2 = ((C242619s) this).A00;
        AnonymousClass26S r3 = r2.A06;
        C242819u.A01(r3);
        if (r3.A01 && !r3.A02) {
            AnonymousClass16M.A00();
            A0C();
            try {
                AnonymousClass26N r6 = this.A05;
                AnonymousClass16M.A00();
                r6.A0C();
                String str = AnonymousClass26N.A04;
                Cursor cursor = null;
                try {
                    Cursor rawQuery = r6.A0D().rawQuery(str, null);
                    if (rawQuery.moveToFirst()) {
                        long j = rawQuery.getLong(0);
                        rawQuery.close();
                        if (j == 0) {
                            return;
                        }
                        if (r2.A03 == null) {
                            throw null;
                        } else if (Math.abs(System.currentTimeMillis() - j) <= ((Number) AnonymousClass1A5.A0G.A00).longValue()) {
                            A06("Dispatch alarm scheduled (ms)", Long.valueOf(((Number) AnonymousClass1A5.A0F.A00).longValue()));
                            r3.A0C();
                            C001801b.A1b(r3.A01, "Receiver not registered");
                            long longValue = ((Number) AnonymousClass1A5.A0F.A00).longValue();
                            if (longValue > 0) {
                                r3.A0E();
                                C242819u r22 = ((C242619s) r3).A00;
                                if (r22.A03 != null) {
                                    long elapsedRealtime = SystemClock.elapsedRealtime() + longValue;
                                    r3.A02 = true;
                                    if (Build.VERSION.SDK_INT >= 24) {
                                        r3.A03("Scheduling upload with JobScheduler");
                                        Context context = r22.A00;
                                        ComponentName componentName = new ComponentName(context, "com.google.android.gms.analytics.AnalyticsJobService");
                                        int A0D = r3.A0D();
                                        PersistableBundle persistableBundle = new PersistableBundle();
                                        persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                                        JobInfo build = new JobInfo.Builder(A0D, componentName).setMinimumLatency(longValue).setOverrideDeadline(longValue << 1).setExtras(persistableBundle).build();
                                        r3.A06("Scheduling job. JobID", Integer.valueOf(A0D));
                                        AnonymousClass1AJ.A00(context, build);
                                        return;
                                    }
                                    r3.A03("Scheduling upload with AlarmManager");
                                    AlarmManager alarmManager = r3.A03;
                                    Context context2 = r22.A00;
                                    alarmManager.setInexactRepeating(2, elapsedRealtime, longValue, PendingIntent.getBroadcast(context2, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(context2, "com.google.android.gms.analytics.AnalyticsReceiver")), 0));
                                    return;
                                }
                                throw null;
                            }
                        }
                    } else {
                        rawQuery.close();
                    }
                } catch (SQLiteException e) {
                    r6.A02(6, "Database error", str, e, null);
                    throw e;
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                A09("Failed to get min/max hit times from local store", e2);
            }
        }
    }

    public final void A0I() {
        AnonymousClass1A3 r5 = this.A06;
        if (r5.A02 != 0) {
            A03("All hits dispatched or no network/service. Going to power save mode");
        }
        r5.A02 = 0;
        r5.A00().removeCallbacks(r5.A01);
        AnonymousClass26S r1 = ((C242619s) this).A00.A06;
        C242819u.A01(r1);
        if (r1.A02) {
            r1.A0E();
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:308:0x059a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r40v0, types: [X.1kk, X.19s, X.26P] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.1kk, X.19s, X.26N] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02c6, code lost:
        if (r19 == 0) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02c8, code lost:
        r11 = java.lang.String.valueOf((java.lang.String) X.AnonymousClass1A5.A0K.A00);
        r5 = java.lang.String.valueOf(X.AnonymousClass1A5.A0M.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02de, code lost:
        if (r5.length() == 0) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02e0, code lost:
        r4 = r11.concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02e5, code lost:
        r4 = new java.lang.String(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r12 = new java.net.URL(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02ef, code lost:
        if (r15 == false) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02f1, code lost:
        r11 = r10.toByteArray();
        X.C001801b.A1Q(r12);
        X.C001801b.A1Q(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r4.A00.getPackageName();
        r5 = new java.io.ByteArrayOutputStream();
        r4 = new java.util.zip.GZIPOutputStream(r5);
        r4.write(r11);
        r4.close();
        r5.close();
        r10 = r5.toByteArray();
        r4 = r10.length;
        r18 = java.lang.Integer.valueOf(r4);
        r9 = r11.length;
        r6.A02(3, "POST compressed size, ratio %, url", r18, java.lang.Long.valueOf((((long) r4) * 100) / ((long) r9)), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x033a, code lost:
        if (r4 <= r9) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x033c, code lost:
        r6.A0A("Compressed payload is larger then uncompressed. compressed, uncompressed", r18, java.lang.Integer.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0356, code lost:
        if (android.util.Log.isLoggable((java.lang.String) X.AnonymousClass1A5.A0C.A00, 2) == false) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0358, code lost:
        r4 = new java.lang.String(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0365, code lost:
        if (r4.length() == 0) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0367, code lost:
        r4 = "\n".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x036b, code lost:
        r6.A06("Post payload", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x036e, code lost:
        r5 = r6.A0F(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0373, code lost:
        r4 = new java.lang.String("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r5.setDoOutput(true);
        r5.addRequestProperty("Content-Encoding", "gzip");
        r5.setFixedLengthStreamingMode(r4);
        r5.connect();
        r9 = r5.getOutputStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r9.write(r10);
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0395, code lost:
        r6.A0G(r5);
        r9 = r5.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x039c, code lost:
        if (r9 != 200) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x039e, code lost:
        r4 = r4.A04;
        X.C242819u.A01(r4);
        r4.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03a8, code lost:
        r6.A07("POST status", java.lang.Integer.valueOf(r9));
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b5, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03b7, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03b8, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03ba, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03bb, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        r6.A08("Network compressed POST connection error", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03c1, code lost:
        if (r9 != null) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03c7, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03c8, code lost:
        r6.A09("Error closing http compressed post connection output stream", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03cb, code lost:
        if (r5 != null) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03ce, code lost:
        r23 = r6.A0D(r12, r10.toByteArray());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03d7, code lost:
        r23 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03db, code lost:
        if (200 != r23) goto L_0x03eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03dd, code lost:
        r6.A06("Batched upload completed. Hits batched", java.lang.Integer.valueOf(r19));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03e8, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03eb, code lost:
        r5 = java.lang.Integer.valueOf(r23);
        r6.A06("Network error uploading hits. status code", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0400, code lost:
        if (r4.A00().contains(r5) != false) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0402, code lost:
        r6.A04("Server instructed the client to stop batching");
        r6.A00.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x040e, code lost:
        r20 = new java.util.ArrayList(r12.size());
        r15 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0421, code lost:
        if (r15.hasNext() == false) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0423, code lost:
        r11 = (X.AnonymousClass1A9) r15.next();
        X.C001801b.A1Q(r11);
        r4 = r11.A04;
        r14 = r6.A0E(r11, !r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0434, code lost:
        if (r14 != null) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0436, code lost:
        r5 = r4.A07;
        X.C242819u.A01(r5);
        r5.A0D(r11, "Error formatting hit for upload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0442, code lost:
        r20.add(java.lang.Long.valueOf(r11.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x045b, code lost:
        if (r20.size() < ((java.lang.Integer) X.AnonymousClass1A5.A0H.A00).intValue()) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x045f, code lost:
        r13 = r14.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x046d, code lost:
        if (r13 > ((java.lang.Integer) X.AnonymousClass1A5.A0N.A00).intValue()) goto L_0x04dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0471, code lost:
        if (r4 == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0473, code lost:
        r10 = (java.lang.String) X.AnonymousClass1A5.A0K.A00;
        r5 = (java.lang.String) X.AnonymousClass1A5.A0L.A00;
        r4 = X.AnonymousClass008.A09(r13 + X.AnonymousClass008.A00(r5, X.AnonymousClass008.A00(r10, 1)), r10, r5, "?", r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x048d, code lost:
        r10 = (java.lang.String) X.AnonymousClass1A5.A0J.A00;
        r5 = (java.lang.String) X.AnonymousClass1A5.A0L.A00;
        r4 = X.AnonymousClass008.A09(r13 + X.AnonymousClass008.A00(r5, X.AnonymousClass008.A00(r10, 1)), r10, r5, "?", r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r5 = new java.net.URL(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04ab, code lost:
        X.C001801b.A1Q(r5);
        r6.A07("GET request", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r10 = r6.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        r10.connect();
        r6.A0G(r10);
        r12 = r10.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04c1, code lost:
        if (r12 != 200) goto L_0x04cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04c3, code lost:
        r4 = r4.A04;
        X.C242819u.A01(r4);
        r4.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04cd, code lost:
        r6.A07("GET status", java.lang.Integer.valueOf(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04d6, code lost:
        r10.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04d9, code lost:
        if (r12 != 200) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04dd, code lost:
        r5 = r6.A0E(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04e3, code lost:
        if (r5 != null) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04e5, code lost:
        r5 = r4.A07;
        X.C242819u.A01(r5);
        r5.A0D(r11, "Error formatting hit for POST upload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04f3, code lost:
        r10 = r5.getBytes();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0502, code lost:
        if (r10.length <= ((java.lang.Integer) X.AnonymousClass1A5.A0R.A00).intValue()) goto L_0x0512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0504, code lost:
        r5 = r4.A07;
        X.C242819u.A01(r5);
        r5.A0D(r11, "Hit payload exceeds size limit");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0512, code lost:
        if (r4 == false) goto L_0x0539;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0514, code lost:
        r12 = java.lang.String.valueOf((java.lang.String) X.AnonymousClass1A5.A0K.A00);
        r5 = java.lang.String.valueOf((java.lang.String) X.AnonymousClass1A5.A0L.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x052c, code lost:
        if (r5.length() == 0) goto L_0x0533;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x052e, code lost:
        r5 = r12.concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0533, code lost:
        r5 = new java.lang.String(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0539, code lost:
        r12 = java.lang.String.valueOf((java.lang.String) X.AnonymousClass1A5.A0J.A00);
        r5 = java.lang.String.valueOf((java.lang.String) X.AnonymousClass1A5.A0L.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0551, code lost:
        if (r5.length() == 0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0553, code lost:
        r5 = r12.concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0558, code lost:
        r5 = new java.lang.String(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0566, code lost:
        if (r6.A0D(new java.net.URL(r5), r10) != 200) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x056a, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x056c, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x056d, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
        r6.A08("Network GET connection error", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0579, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x057a, code lost:
        r6.A09("Error trying to parse the hardcoded host url", r4);
        r6.A05("Failed to build collect GET endpoint url");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0583, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0584, code lost:
        r6.A09("Error trying to parse the hardcoded host url", r4);
        r6.A05("Failed to build collect POST endpoint url");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x058d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x058e, code lost:
        r6.A09("Error trying to parse the hardcoded host url", r4);
        r6.A05("Failed to build batching endpoint url");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0596, code lost:
        r20 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x059a, code lost:
        r7 = r20.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05a4, code lost:
        if (r7.hasNext() != false) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05a6, code lost:
        r0 = java.lang.Math.max(r0, ((java.lang.Long) r7.next()).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        r4.A0H(r20);
        r25.addAll(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05c7, code lost:
        if (r25.isEmpty() != false) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05f1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05f2, code lost:
        A09("Failed to remove hit that was send for delivery", r1);
        A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:?, code lost:
        r4.A0G();
        r4.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0604, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0605, code lost:
        A09("Failed to commit local dispatch transaction", r0);
        A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x060d, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x060e, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0610, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0612, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0613, code lost:
        r9 = null;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0615, code lost:
        if (r9 != null) goto L_0x0617;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x061b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x061c, code lost:
        r6.A09("Error closing http compressed post connection output stream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x061f, code lost:
        if (r5 != null) goto L_0x0621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0621, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0624, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0627, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0628, code lost:
        if (r10 != null) goto L_0x062a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x062a, code lost:
        r10.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x062e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x062f, code lost:
        A09("Failed to remove successfully uploaded hits", r1);
        A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:?, code lost:
        r4.A0G();
        r4.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0640, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0641, code lost:
        A09("Failed to commit local dispatch transaction", r0);
        A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:?, code lost:
        r4.A0G();
        r4.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0651, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0652, code lost:
        A09("Failed to commit local dispatch transaction", r0);
        A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0659, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x065a, code lost:
        A09("Failed to commit local dispatch transaction", r0);
        A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0118, code lost:
        if (r0.A0F() == false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011a, code lost:
        A03("Service connected, sending hits to the service");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0123, code lost:
        if (r7.isEmpty() != false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0125, code lost:
        r9 = (X.AnonymousClass1A9) r7.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0133, code lost:
        if (r0.A0G(r9) == false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0135, code lost:
        r4 = r9.A01;
        r0 = java.lang.Math.max(r0, r4);
        r7.remove(r9);
        A07("Hit sent do device AnalyticsService for delivery", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.AnonymousClass16M.A00();
        r4.A0C();
        r8 = new java.util.ArrayList(1);
        r5 = java.lang.Long.valueOf(r4);
        r8.add(r5);
        r4.A06("Deleting hit, id", r5);
        r4.A0H(r8);
        r25.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x016c, code lost:
        if (r6.A0H() == false) goto L_0x05c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x016e, code lost:
        r8 = X.EnumC243119z.A01;
        X.AnonymousClass16M.A00();
        r6.A0C();
        X.C001801b.A1Q(r12);
        r4 = ((X.C242619s) r6).A00;
        r4 = r4.A05;
        r23 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x018c, code lost:
        if (r4.A00().isEmpty() != false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01a2, code lost:
        if (r6.A00.A01(((long) ((java.lang.Integer) X.AnonymousClass1A5.A01.A00).intValue()) * 1000) == false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01a4, code lost:
        r5 = (java.lang.String) X.AnonymousClass1A5.A0O.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01b0, code lost:
        if ("BATCH_BY_SESSION".equalsIgnoreCase(r5) == false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b2, code lost:
        r4 = X.EnumC243119z.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01bb, code lost:
        if ("BATCH_BY_TIME".equalsIgnoreCase(r5) == false) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01bd, code lost:
        r4 = X.EnumC243119z.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01c6, code lost:
        if ("BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(r5) == false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01c8, code lost:
        r4 = X.EnumC243119z.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d1, code lost:
        if ("BATCH_BY_COUNT".equalsIgnoreCase(r5) == false) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01d3, code lost:
        r4 = X.EnumC243119z.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01dc, code lost:
        if ("BATCH_BY_SIZE".equalsIgnoreCase(r5) == false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01de, code lost:
        r4 = X.EnumC243119z.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01e1, code lost:
        r4 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01e2, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01e3, code lost:
        if (r4 == r8) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e5, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01f2, code lost:
        if ("GZIP".equalsIgnoreCase((java.lang.String) X.AnonymousClass1A5.A0P.A00) == false) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01f4, code lost:
        r5 = X.AnonymousClass1A0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f6, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f9, code lost:
        if (r5 == X.AnonymousClass1A0.A02) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01fc, code lost:
        r5 = X.AnonymousClass1A0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ff, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0200, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0205, code lost:
        if (r10 == false) goto L_0x040e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0207, code lost:
        X.C001801b.A1Y(!r12.isEmpty());
        r6.A02(2, "Uploading batched hits. compression, count", java.lang.Boolean.valueOf(r15), java.lang.Integer.valueOf(r12.size()), null);
        r10 = new java.io.ByteArrayOutputStream();
        r20 = new java.util.ArrayList();
        r14 = r12.iterator();
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x023c, code lost:
        if (r14.hasNext() == false) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x023e, code lost:
        r11 = (X.AnonymousClass1A9) r14.next();
        X.C001801b.A1Q(r11);
        r12 = r19 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0253, code lost:
        if (r12 > ((java.lang.Integer) X.AnonymousClass1A5.A0I.A00).intValue()) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0255, code lost:
        r4 = r6.A0E(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x025d, code lost:
        if (r4 != null) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x025f, code lost:
        r5 = r4.A07;
        X.C242819u.A01(r5);
        r5.A0D(r11, "Error formatting hit");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0277, code lost:
        r5 = r4.getBytes();
        r4 = r5.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0286, code lost:
        if (r4 <= ((java.lang.Integer) X.AnonymousClass1A5.A0Q.A00).intValue()) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0288, code lost:
        r5 = r4.A07;
        X.C242819u.A01(r5);
        r5.A0D(r11, "Hit size exceeds the maximum size limit");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0299, code lost:
        if (r10.size() <= 0) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x029b, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02ac, code lost:
        if ((r10.size() + r4) > ((java.lang.Integer) X.AnonymousClass1A5.A0S.A00).intValue()) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b2, code lost:
        if (r10.size() <= 0) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02b4, code lost:
        r10.write(X.AnonymousClass26V.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02b9, code lost:
        r10.write(r5);
        r19 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02bf, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02c0, code lost:
        r6.A09("Failed to write payload when batching hits", r5);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03c3 A[SYNTHETIC, Splitter:B:138:0x03c3] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0575 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x05a6 A[LOOP:5: B:213:0x05a0->B:215:0x05a6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x05ca  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0617 A[SYNTHETIC, Splitter:B:244:0x0617] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0621  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x06a1  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x06ae  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0648 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(X.AnonymousClass1A4 r41) {
        /*
        // Method dump skipped, instructions count: 1766
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26P.A0J(X.1A4):void");
    }
}
