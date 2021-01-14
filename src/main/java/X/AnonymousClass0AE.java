package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.0AE  reason: invalid class name */
public class AnonymousClass0AE extends Handler {
    public final /* synthetic */ AnonymousClass09F A00;
    public final /* synthetic */ AnonymousClass0AB A01;
    public final /* synthetic */ AnonymousClass0AC A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0AE(AnonymousClass0AB r1, Looper looper, AnonymousClass0AC r3, AnonymousClass09F r4) {
        super(looper);
        this.A01 = r1;
        this.A02 = r3;
        this.A00 = r4;
    }

    public void handleMessage(Message message) {
        AbstractC007503q r1 = (AbstractC007503q) message.obj;
        int i = message.what;
        if (i == 3) {
            Log.d("msgstore/addhandler/duplicate");
            AnonymousClass0AC r0 = this.A02;
            if (r0 != null) {
                AnonymousClass00E.A01();
                Iterator it = r0.A00.iterator();
                while (true) {
                    AnonymousClass0AY r2 = (AnonymousClass0AY) it;
                    if (r2.hasNext()) {
                        AnonymousClass019 r3 = (AnonymousClass019) r2.next();
                        if (r3 instanceof C04220Jn) {
                            C04220Jn r32 = (C04220Jn) r3;
                            if (r1 != null) {
                                StringBuilder A0S = AnonymousClass008.A0S("app/message/received/duplicate ");
                                C007303n r5 = r1.A0n;
                                String str = r5.A01;
                                A0S.append(str);
                                A0S.append(" ");
                                AnonymousClass01I r4 = r32.A04;
                                r4.A04();
                                A0S.append(r4.A03);
                                A0S.append(" ");
                                AnonymousClass02N r12 = r5.A00;
                                A0S.append(r12);
                                A0S.append(" ");
                                A0S.append(r1.A07());
                                Log.i(A0S.toString());
                                if (!r5.A02) {
                                    r32.A06.A02(r1);
                                } else if (r1 instanceof C05400Oj) {
                                    C05400Oj r02 = (C05400Oj) r1;
                                    AnonymousClass1XX r22 = r02.A04;
                                    if (r22 != null) {
                                        r32.A0T.A0M(r22);
                                    } else if (((C05390Oi) r02).A00 == 6) {
                                        r32.A06.A08(str, r1.A0s, r12, null, "picture");
                                    }
                                } else {
                                    EnumC05410Ok r23 = r1.A0J;
                                    if (r23 == EnumC05410Ok.RELAY || r23 == EnumC05410Ok.RETRY) {
                                        r32.A0X.A0E(str, 200);
                                        AnonymousClass09G r8 = r32.A06;
                                        long j = r1.A0s;
                                        r4.A04();
                                        AnonymousClass0HR r03 = r4.A01;
                                        if (r03 != null) {
                                            r8.A08(str, j, r03.A09, null, "web");
                                        } else {
                                            throw null;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        return;
                    }
                }
            } else {
                throw null;
            }
        } else if (i == 4) {
            Log.d("msgstore/addhandler/chatadded");
            AnonymousClass09F r24 = this.A00;
            AnonymousClass02N r04 = r1.A0n.A00;
            if (r04 != null) {
                r24.A02(r04);
                this.A02.A05(r1, message.arg1);
                return;
            }
            throw null;
        } else if (i == 5) {
            Log.d("msgstore/addhandler/chatchanged");
            AnonymousClass0AB r52 = this.A01;
            r52.A04.A05(r1, message.arg1);
            AnonymousClass0MH r42 = r1.A0F;
            if (r42 != null) {
                AnonymousClass0AD r05 = r52.A05;
                if (r05 != null) {
                    AnonymousClass00E.A01();
                    Iterator it2 = r05.A00.iterator();
                    while (true) {
                        AnonymousClass0AY r25 = (AnonymousClass0AY) it2;
                        if (!r25.hasNext()) {
                            break;
                        }
                        ((AbstractC29091Wz) r25.next()).AIP(r42);
                    }
                } else {
                    throw null;
                }
            }
            AnonymousClass09F r26 = r52.A03;
            AnonymousClass02N r13 = r1.A0n.A00;
            if (r13 != null) {
                r26.A03(r13, false);
                return;
            }
            throw null;
        } else if (i == 6) {
            Log.d("msgstore/addhandler/unarchived");
            this.A00.A01();
        } else if (i == 7) {
            Log.d("msgstore/addhandler/offline-completed");
            AnonymousClass0AC r06 = this.A02;
            if (r06 != null) {
                AnonymousClass00E.A01();
                Iterator it3 = r06.A00.iterator();
                while (true) {
                    AnonymousClass0AY r14 = (AnonymousClass0AY) it3;
                    if (r14.hasNext()) {
                        AnonymousClass019 r27 = (AnonymousClass019) r14.next();
                        if (r27 instanceof C04220Jn) {
                            C04220Jn r28 = (C04220Jn) r27;
                            if (r28.A0H.A02()) {
                                r28.A0T.A08.A09(Message.obtain(null, 0, 22, 0, new RunnableEBaseShape1S0100000_I0_1(r28, 19)));
                            }
                        }
                    } else {
                        return;
                    }
                }
            } else {
                throw null;
            }
        }
    }
}
