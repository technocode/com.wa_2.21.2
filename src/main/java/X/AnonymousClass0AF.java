package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0AF  reason: invalid class name */
public class AnonymousClass0AF extends Handler {
    public final /* synthetic */ AnonymousClass0A8 A00;
    public final /* synthetic */ AnonymousClass0AB A01;
    public final /* synthetic */ AnonymousClass0AC A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0AF(AnonymousClass0AB r1, Looper looper, AnonymousClass0AC r3, AnonymousClass0A8 r4) {
        super(looper);
        this.A01 = r1;
        this.A02 = r3;
        this.A00 = r4;
    }

    public void handleMessage(Message message) {
        AbstractC007503q r0;
        AbstractC007503q r4;
        if (message.what == 11) {
            Pair pair = (Pair) message.obj;
            r0 = (AbstractC007503q) pair.first;
            r4 = (AbstractC007503q) pair.second;
        } else {
            r0 = (AbstractC007503q) message.obj;
            r4 = null;
        }
        int i = message.what;
        if (i != 2) {
            switch (i) {
                case 10:
                    AnonymousClass0AC r1 = this.A02;
                    if (r1 != null) {
                        AnonymousClass00E.A01();
                        Iterator it = r1.A00.iterator();
                        while (true) {
                            AnonymousClass0AY r2 = (AnonymousClass0AY) it;
                            if (r2.hasNext()) {
                                AnonymousClass019 r5 = (AnonymousClass019) r2.next();
                                if (r5 instanceof C71693Py) {
                                    C71693Py r52 = (C71693Py) r5;
                                    if (r0 != null) {
                                        C007303n r42 = r0.A0n;
                                        String str = r42.A01;
                                        C75033c0 r22 = r52.A00;
                                        AbstractC007503q r12 = ((AbstractC74123aA) r22).A03;
                                        if (r12 == null) {
                                            throw null;
                                        } else if (str.equals(r12.A0n.A01) && r42.A02) {
                                            r22.A0S();
                                        }
                                    } else {
                                        continue;
                                    }
                                } else if (r5 instanceof AnonymousClass3PM) {
                                    AnonymousClass3PM r53 = (AnonymousClass3PM) r5;
                                    if (r0 != null) {
                                        C007303n r23 = r0.A0n;
                                        if (AnonymousClass1VY.A0b(r23.A00) && r23.A02) {
                                            MyStatusesActivity.A04(r53.A00, r0, true);
                                        }
                                    }
                                } else if (r5 instanceof AnonymousClass1t3) {
                                    ((AnonymousClass1t3) r5).A04(r0);
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        throw null;
                    }
                case 11:
                    Log.d("msgstore/updatehandler/placeholder-message-replaced");
                    AnonymousClass0AC r13 = this.A02;
                    if (r13 == null) {
                        throw null;
                    } else if (r4 != null) {
                        AnonymousClass00E.A01();
                        Iterator it2 = r13.A00.iterator();
                        while (true) {
                            AnonymousClass0AY r24 = (AnonymousClass0AY) it2;
                            if (r24.hasNext()) {
                                AnonymousClass019 r6 = (AnonymousClass019) r24.next();
                                if (r6 instanceof C04220Jn) {
                                    C04220Jn r62 = (C04220Jn) r6;
                                    if (r0 != null && r4.A0m == 11) {
                                        AnonymousClass0K1 r8 = r62.A0V;
                                        if (r8 == null) {
                                            throw null;
                                        } else if (AnonymousClass0FI.A0V(r0)) {
                                            if (r8.A03.A03() && r8.A04()) {
                                                ArrayList arrayList = new ArrayList(1);
                                                arrayList.add(r0);
                                                r8.A03(null, arrayList, 4, false, false, null, null, 4, null, null);
                                            }
                                            r62.A0E.A01(new RunnableEBaseShape1S0200000_I0_0(r62, r0, 12), 11);
                                        } else {
                                            throw new IllegalArgumentException("message thumb not loaded");
                                        }
                                    }
                                    r62.A0J.A07(r4, 3);
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                case 12:
                    Log.d("msgstore/updatehandler/conversation-not-spam");
                    AnonymousClass0A8 r14 = this.A00;
                    AnonymousClass02N r63 = r0.A0n.A00;
                    if (r63 != null) {
                        AnonymousClass02N r64 = r63;
                        synchronized (r14.A00) {
                            Iterator it3 = r14.A00.iterator();
                            while (true) {
                                AnonymousClass0AY r15 = (AnonymousClass0AY) it3;
                                if (r15.hasNext()) {
                                    AnonymousClass0BR r16 = (AnonymousClass0BR) r15.next();
                                    if (r16 instanceof AnonymousClass0PG) {
                                        ((AnonymousClass0PG) r16).A01.A01(9, r64, 0, 0);
                                    }
                                }
                            }
                        }
                        return;
                    }
                    throw null;
                case 13:
                    Log.d("msgstore/updatehandler/conversation-marked-as-encrypted");
                    AnonymousClass0A8 r17 = this.A00;
                    AnonymousClass02N r43 = r0.A0n.A00;
                    if (r43 != null) {
                        AnonymousClass02N r44 = r43;
                        synchronized (r17.A00) {
                            Iterator it4 = r17.A00.iterator();
                            while (true) {
                                AnonymousClass0AY r18 = (AnonymousClass0AY) it4;
                                if (r18.hasNext()) {
                                    AnonymousClass0BR r19 = (AnonymousClass0BR) r18.next();
                                    if (r19 instanceof AnonymousClass0PG) {
                                        ((AnonymousClass0PG) r19).A00.A04(r44);
                                    }
                                }
                            }
                        }
                        return;
                    }
                    throw null;
                default:
                    return;
            }
        } else {
            this.A01.A02(r0, message.arg1);
        }
    }
}
