package com.whatsapp.jobqueue.job;

import X.AbstractC007503q;
import X.AbstractC04160Jh;
import X.AbstractC29211Xn;
import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00S;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01N;
import X.AnonymousClass01S;
import X.AnonymousClass01T;
import X.AnonymousClass02N;
import X.AnonymousClass02P;
import X.AnonymousClass02X;
import X.AnonymousClass09H;
import X.AnonymousClass0AH;
import X.AnonymousClass0B2;
import X.AnonymousClass0EA;
import X.AnonymousClass0FI;
import X.AnonymousClass0I8;
import X.AnonymousClass0OP;
import X.AnonymousClass0X9;
import X.AnonymousClass0ZG;
import X.AnonymousClass0ZJ;
import X.AnonymousClass1UG;
import X.AnonymousClass1VY;
import X.AnonymousClass2LF;
import X.AnonymousClass321;
import X.C001000o;
import X.C001400w;
import X.C001801b;
import X.C007103l;
import X.C007303n;
import X.C014708f;
import X.C01970Ad;
import X.C02840Dr;
import X.C03350Fv;
import X.C04540Kt;
import X.C04970Mo;
import X.C04980Mp;
import X.C06190Sd;
import X.C21020xy;
import X.C75903dg;
import X.CallableC49662Rn;
import X.EnumC05410Ok;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.jobqueue.Job;

public final class SendE2EMessageJob extends Job implements AnonymousClass0EA {
    public static final ConcurrentHashMap A0N = new ConcurrentHashMap();
    public static final long serialVersionUID = 1;
    public transient AnonymousClass009 A00;
    public transient AnonymousClass01I A01;
    public transient AnonymousClass0AH A02;
    public transient C04540Kt A03;
    public transient AnonymousClass00S A04;
    public transient C001000o A05;
    public transient C001400w A06;
    public transient AnonymousClass01K A07;
    public transient AnonymousClass01T A08;
    public transient AnonymousClass0B2 A09;
    public transient AnonymousClass01N A0A;
    public transient AnonymousClass0I8 A0B;
    public transient C06190Sd A0C;
    public transient DeviceJid A0D;
    public transient AnonymousClass01S A0E;
    public transient AnonymousClass09H A0F;
    public transient C01970Ad A0G;
    public transient C02840Dr A0H;
    public transient C014708f A0I;
    public transient C03350Fv A0J;
    public transient AbstractC29211Xn A0K;
    public transient AnonymousClass321 A0L;
    public transient AnonymousClass0X9 A0M;
    public final HashMap broadcastParticipantEphemeralSettings;
    public boolean duplicate;
    public final int editVersion;
    public final HashMap encryptionRetryCounts;
    public final byte[] ephemeralSharedSecret;
    public final long expireTimeMs;
    public final String groupParticipantHash;
    public String groupParticipantHashToSend;
    public final String id;
    public final boolean includeSenderKeysInMessage;
    public final String jid;
    public final Integer liveLocationDuration;
    public final boolean multiDeviceFanOut;
    public final long originalTimestamp;
    public final int originationFlags;
    public final String participant;
    public final String recipientRawJid;
    public final int retryCount;
    public final HashSet targetDeviceRawJids;
    public final boolean useOneOneEncryptionOnPHashMismatch;
    public final EnumC05410Ok webAttribute;

    public class EncryptionFailException extends Exception {
        public final int encryptionRetryCount;
        public final DeviceJid jid;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public EncryptionFailException(com.whatsapp.jid.DeviceJid r3, int r4) {
            /*
                r2 = this;
                java.lang.String r1 = "Unable to encrypt message for "
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.jid = r3
                r2.encryptionRetryCount = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.EncryptionFailException.<init>(com.whatsapp.jid.DeviceJid, int):void");
        }
    }

    public class UnrecoverableErrorException extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnrecoverableErrorException(com.whatsapp.jid.DeviceJid r3) {
            /*
                r2 = this;
                java.lang.String r1 = "Unable to encrypt message for "
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.UnrecoverableErrorException.<init>(com.whatsapp.jid.DeviceJid):void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r12 != null) goto L_0x001c;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendE2EMessageJob(X.C02840Dr r9, java.lang.String r10, com.whatsapp.jid.Jid r11, com.whatsapp.jid.DeviceJid r12, com.whatsapp.jid.UserJid r13, java.util.Set r14, int r15, java.lang.String r16, java.lang.String r17, X.EnumC05410Ok r18, byte[] r19, boolean r20, long r21, long r23, int r25, int r26, java.lang.Integer r27, boolean r28, boolean r29, byte[] r30, java.util.Map r31, X.AnonymousClass321 r32) {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.<init>(X.0Dr, java.lang.String, com.whatsapp.jid.Jid, com.whatsapp.jid.DeviceJid, com.whatsapp.jid.UserJid, java.util.Set, int, java.lang.String, java.lang.String, X.0Ok, byte[], boolean, long, long, int, int, java.lang.Integer, boolean, boolean, byte[], java.util.Map, X.321):void");
    }

    public static final C02840Dr A00(C02840Dr r5, String str, String str2) {
        AbstractC04160Jh A0B2 = C75903dg.A05.AQb();
        if (r5 != null) {
            A0B2.A02();
            C75903dg r1 = (C75903dg) A0B2.A00;
            r1.A02 = r5;
            r1.A00 |= 2;
        }
        if (str != null) {
            A0B2.A02();
            C75903dg r12 = (C75903dg) A0B2.A00;
            r12.A00 |= 1;
            r12.A03 = str;
        }
        if (str2 != null) {
            A0B2.A02();
            C75903dg r13 = (C75903dg) A0B2.A00;
            r13.A00 |= 4;
            r13.A04 = str2;
        }
        C04970Mo A082 = C02840Dr.A08();
        A082.A02();
        C02840Dr r2 = (C02840Dr) A082.A00;
        if (r2 != null) {
            r2.A0B = (C75903dg) A0B2.A01();
            r2.A00 |= 33554432;
            return (C02840Dr) A082.A01();
        }
        throw null;
    }

    public static AnonymousClass02P A01(AnonymousClass1UG r4) {
        if (r4.A01 == 0) {
            return new AnonymousClass02P(2, AnonymousClass0FI.A00(r4.A00), r4.A02);
        }
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x0075 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Set] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // org.whispersystems.jobqueue.Job
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.A02():void");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:512:0x0442 */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0326, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0327, code lost:
        if (r8 != null) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x032c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x032f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0333, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0393, code lost:
        if ((!r1.equals(r51.groupParticipantHash)) != false) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x095d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0961, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0964, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0968, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x096b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x096f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0972, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0976, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0a11, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0a15, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0a18, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0a1c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0a20, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0a24, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0a27, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0a2b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0299, code lost:
        if (r32 != null) goto L_0x029b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x067f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0686  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x06f9  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x071d  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0767  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x088c A[Catch:{ all -> 0x0a20 }] */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0979  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0a1d  */
    @Override // org.whispersystems.jobqueue.Job
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
        // Method dump skipped, instructions count: 2694
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.A03():void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A04() {
        if (this.A04.A05() >= this.expireTimeMs || super.A04()) {
            return true;
        }
        return false;
    }

    public final synchronized int A05(DeviceJid deviceJid) {
        int A062;
        A062 = A06(deviceJid) + 1;
        this.encryptionRetryCounts.put(deviceJid.getRawString(), Integer.valueOf(A062));
        return A062;
    }

    public final synchronized int A06(DeviceJid deviceJid) {
        String rawString = deviceJid.getRawString();
        if (!this.encryptionRetryCounts.containsKey(rawString)) {
            return 0;
        }
        return ((Integer) this.encryptionRetryCounts.get(rawString)).intValue();
    }

    public final AnonymousClass1UG A07(DeviceJid deviceJid, C02840Dr r10, AbstractC007503q r11) {
        int A062;
        AnonymousClass1UG A072 = this.A05.A07(C001801b.A0A(deviceJid), r10.A09());
        AnonymousClass0AH r1 = this.A02;
        Jid nullable = Jid.getNullable(this.jid);
        int i = this.retryCount;
        if (A072.A01 == 0) {
            A062 = 0;
        } else {
            A062 = A06(deviceJid) + 1;
        }
        r1.A0B(r11, A072, nullable, deviceJid, i, A062);
        return A072;
    }

    public final C02840Dr A08(UserJid userJid, C02840Dr r6) {
        AnonymousClass2LF A032 = this.A0B.A03(userJid);
        if (A032 == null) {
            return r6;
        }
        C04970Mo r2 = (C04970Mo) C02840Dr.A0b.AQb();
        r2.A02();
        r2.A00.A0E(C04980Mp.A00, r6);
        AnonymousClass0ZG.A0C(r2, A032);
        return (C02840Dr) r2.A01();
    }

    public final C02840Dr A09(C007303n r4, DeviceJid deviceJid, C02840Dr r6) {
        String str;
        String str2;
        if (!this.A01.A09(deviceJid.userJid)) {
            return r6;
        }
        AnonymousClass02N r2 = r4.A00;
        if (!TextUtils.isEmpty(this.recipientRawJid)) {
            str = this.recipientRawJid;
        } else {
            str = this.jid;
        }
        if (AnonymousClass1VY.A0U(r2)) {
            str2 = A0C(this.A0A.A03(r4));
        } else {
            str2 = null;
        }
        return A00(r6, str, str2);
    }

    public final AnonymousClass02P A0A(DeviceJid deviceJid, C02840Dr r4, AbstractC007503q r5) {
        C001400w r0 = this.A06;
        return (AnonymousClass02P) r0.A00.submit(new CallableC49662Rn(this, deviceJid, r4, r5)).get();
    }

    public final String A0B() {
        String A0E2 = AnonymousClass1VY.A0E(this.jid, Jid.class);
        String A0E3 = AnonymousClass1VY.A0E(this.participant, Jid.class);
        StringBuilder A0S = AnonymousClass008.A0S("; id=");
        AnonymousClass008.A1Y(A0S, this.id, "; jid=", A0E2, "; participant=");
        A0S.append(A0E3);
        A0S.append("; retryCount=");
        A0S.append(this.retryCount);
        A0S.append("; groupParticipantHash=");
        A0S.append(this.groupParticipantHash);
        A0S.append("; groupParticipantHashToSend=");
        A0S.append(this.groupParticipantHashToSend);
        A0S.append("; webAttribute=");
        A0S.append(this.webAttribute);
        A0S.append("; includeSenderKeysInMessage=");
        A0S.append(this.includeSenderKeysInMessage);
        A0S.append("; useOneOneEncryptionOnPHashMismatch=");
        A0S.append(this.useOneOneEncryptionOnPHashMismatch);
        A0S.append("; persistentId=");
        A0S.append(super.A01);
        return A0S.toString();
    }

    public final String A0C(Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            UserJid userJid = ((DeviceJid) it.next()).userJid;
            if (!this.A01.A09(userJid)) {
                hashSet.add(userJid.getPrimaryDevice());
            }
        }
        return C001801b.A18(hashSet);
    }

    public final Collection A0D(C007303n r4) {
        Set A032;
        if (A0J()) {
            HashSet hashSet = this.targetDeviceRawJids;
            A032 = new HashSet();
            AnonymousClass1VY.A0O(DeviceJid.class, hashSet, A032);
        } else {
            A032 = this.A0A.A03(r4);
        }
        if (!A0J()) {
            return A032;
        }
        AnonymousClass0B2 r1 = this.A09;
        if (r1 != null) {
            if (!A032.isEmpty()) {
                A032.retainAll(r1.A03.A03(r4));
            }
            return A032;
        }
        throw null;
    }

    public final List A0E(AnonymousClass02X r5, Collection collection, Map map) {
        if (!AnonymousClass1VY.A0T(r5)) {
            return null;
        }
        TreeSet treeSet = new TreeSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (map == null || !map.containsKey(deviceJid)) {
                UserJid userJid = deviceJid.userJid;
                if (!this.A01.A09(userJid)) {
                    treeSet.add(userJid.getPrimaryDevice());
                }
            }
        }
        return new ArrayList(treeSet);
    }

    public final Map A0F(Collection collection, Set set, AbstractC007503q r9) {
        Iterator it = collection.iterator();
        TreeMap treeMap = null;
        C02840Dr r2 = null;
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (this.A01.A08(deviceJid) && !set.contains(deviceJid)) {
                if (treeMap == null) {
                    treeMap = new TreeMap();
                }
                if (r2 == null) {
                    r2 = A00(null, null, A0C(collection));
                }
                AnonymousClass02P A0A2 = A0A(deviceJid, r2, r9);
                if (A0A2 != null) {
                    treeMap.put(deviceJid, A0A2);
                } else {
                    Log.e("sende2emessagejob/failed to encrypt dsm for peer");
                }
            }
        }
        return treeMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r9 != null) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(com.whatsapp.jid.Jid r8, com.whatsapp.jid.DeviceJid r9) {
        /*
        // Method dump skipped, instructions count: 444
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.A0G(com.whatsapp.jid.Jid, com.whatsapp.jid.DeviceJid):void");
    }

    public void A0H(AbstractC007503q r6, int i) {
        if (r6 != null && r6.A0E != 0 && !(r6 instanceof AnonymousClass0ZJ)) {
            this.A02.A0A(r6, i, this.A04.A05() - r6.A0E);
        }
    }

    public final void A0I(Map map, Collection collection) {
        AnonymousClass01I r0 = this.A01;
        r0.A04();
        UserJid userJid = r0.A03;
        if (userJid != null) {
            AnonymousClass0OP A022 = AnonymousClass0OP.A02(this.jid);
            if (A022 != null) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    DeviceJid deviceJid = (DeviceJid) it.next();
                    if (!map.containsKey(deviceJid)) {
                        Object obj = null;
                        if (!this.A01.A08(deviceJid)) {
                            UserJid userJid2 = deviceJid.userJid;
                            C007103l r2 = (C007103l) this.broadcastParticipantEphemeralSettings.get(userJid2.getPrimaryDevice().getRawString());
                            if (r2 != null) {
                                AnonymousClass0X9 r1 = this.A0M;
                                byte[] bArr = this.ephemeralSharedSecret;
                                if (r1 != null) {
                                    obj = JniBridge.jvidispatchOOOOOOO(0, userJid2.getRawString(), A022.getRawString(), userJid.getRawString(), null, new C21020xy(r2.expiration, r2.ephemeralSettingTimestamp / 1000).A00, bArr);
                                    if (obj == null) {
                                        Log.e("sende2emessagejob/failed to encrypt broadcast setting");
                                        throw new EncryptionFailException(deviceJid, A05(deviceJid));
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                Log.e("sende2emessagejob/missing broadcast setting");
                                throw new UnrecoverableErrorException(deviceJid);
                            }
                        }
                        map.put(deviceJid, obj);
                    }
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public final boolean A0J() {
        HashSet hashSet = this.targetDeviceRawJids;
        return hashSet != null && !hashSet.isEmpty();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A04 = AnonymousClass00S.A00();
        this.A00 = AnonymousClass009.A00();
        this.A01 = AnonymousClass01I.A00();
        this.A0F = AnonymousClass09H.A01();
        this.A0C = C06190Sd.A00();
        this.A02 = AnonymousClass0AH.A03();
        this.A06 = C001400w.A02;
        this.A0G = C01970Ad.A00();
        this.A07 = AnonymousClass01K.A00();
        this.A05 = C001000o.A00();
        this.A0A = AnonymousClass01N.A00();
        this.A0B = AnonymousClass0I8.A01();
        this.A0K = AbstractC29211Xn.A00();
        this.A03 = C04540Kt.A00();
        this.A0E = AnonymousClass01S.A00();
        this.A0M = AnonymousClass0X9.A00();
        this.A08 = AnonymousClass01T.A00();
        this.A0I = C014708f.A00();
        this.A09 = AnonymousClass0B2.A00();
        this.A0J = C03350Fv.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A0H = C02840Dr.A09((byte[]) objectInputStream.readObject());
        } catch (OptionalDataException unused) {
            StringBuilder A0S = AnonymousClass008.A0S("sende2emessagejob/e2e missing message bytes ");
            A0S.append(A0B());
            Log.e(A0S.toString());
        }
        if (this.A0H == null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("message must not be null");
            A0S2.append(A0B());
            throw new InvalidObjectException(A0S2.toString());
        } else if (this.id != null) {
            Jid nullable = Jid.getNullable(this.jid);
            if (nullable != null) {
                this.A0D = DeviceJid.getNullable(this.jid);
                DeviceJid nullable2 = DeviceJid.getNullable(this.participant);
                if (this.groupParticipantHashToSend == null) {
                    this.groupParticipantHashToSend = this.groupParticipantHash;
                }
                A0G(nullable, nullable2);
                return;
            }
            StringBuilder A0S3 = AnonymousClass008.A0S("jid must not be null");
            A0S3.append(A0B());
            throw new InvalidObjectException(A0S3.toString());
        } else {
            StringBuilder A0S4 = AnonymousClass008.A0S("id must not be null");
            A0S4.append(A0B());
            throw new InvalidObjectException(A0S4.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A0H.A09());
    }
}
