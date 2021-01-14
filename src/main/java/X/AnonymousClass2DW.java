package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.Conversation;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.http.GoogleSearchDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2DW  reason: invalid class name */
public abstract class AnonymousClass2DW extends ActivityC03630Ha implements AbstractC43421yL {
    public AbstractC06110Rt A00;
    public AnonymousClass1KQ A01;
    public AnonymousClass2IG A02;
    public C47612Is A03;
    public AbstractC007503q A04;
    public C09110cJ A05;
    public HashMap A06;
    public HashSet A07;
    public Map A08;
    public AnonymousClass1Z4 A09;
    public final AnonymousClass01I A0A;
    public final C000300f A0B;
    public final C04360Kb A0C;
    public final C017009c A0D;
    public final AnonymousClass0DH A0E;
    public final AnonymousClass01A A0F;
    public final C014308b A0G;
    public final AnonymousClass08C A0H;
    public final AnonymousClass0L2 A0I;
    public final AnonymousClass2IC A0J;
    public final AnonymousClass00S A0K = AnonymousClass00S.A00();
    public final AnonymousClass00G A0L = AnonymousClass00G.A01;
    public final AnonymousClass03S A0M;
    public final AnonymousClass00D A0N;
    public final AnonymousClass01K A0O;
    public final AnonymousClass0AN A0P;
    public final AnonymousClass0B7 A0Q;
    public final AnonymousClass0AC A0R;
    public final AnonymousClass0CG A0S;
    public final C53492dM A0T;
    public final AnonymousClass0M9 A0U;
    public final AnonymousClass00Y A0V;
    public final C04420Kh A0W;
    public final AnonymousClass0CH A0X;
    public final C02040Ak A0Y;
    public final C01970Ad A0Z;
    public final AnonymousClass31y A0a;
    public final AnonymousClass0D1 A0b;
    public final C666435f A0c;
    public final AnonymousClass36B A0d;
    public final AnonymousClass00T A0e;
    public final AnonymousClass0CN A0f;
    public final C670036v A0g;

    @Override // X.AbstractC43421yL
    public void animateStar(View view) {
    }

    public AnonymousClass2DW() {
        AnonymousClass0Z6.A00();
        AnonymousClass320.A00();
        this.A0c = C666435f.A00();
        this.A0A = AnonymousClass01I.A00();
        this.A0e = C002101e.A00();
        this.A0V = AnonymousClass00Y.A00();
        this.A0B = C000300f.A00();
        this.A0E = AnonymousClass0DH.A00();
        this.A0C = C04360Kb.A00();
        this.A0f = AnonymousClass0CN.A00();
        this.A0I = AnonymousClass0L2.A01();
        this.A0F = AnonymousClass01A.A00();
        this.A0P = AnonymousClass0AN.A00();
        this.A0U = AnonymousClass0M9.A01();
        this.A0G = C014308b.A00();
        this.A0Z = C01970Ad.A00();
        this.A0O = AnonymousClass01K.A00();
        this.A0R = AnonymousClass0AC.A00;
        this.A0d = AnonymousClass36B.A01();
        this.A0a = AnonymousClass31y.A00();
        this.A0T = C53492dM.A00();
        this.A0S = AnonymousClass0CG.A00();
        this.A0M = AnonymousClass03S.A00();
        this.A0N = AnonymousClass00D.A00();
        this.A0Q = AnonymousClass0B7.A00();
        this.A0H = AnonymousClass08C.A00();
        this.A0X = AnonymousClass0CH.A00();
        this.A0Y = C02040Ak.A00();
        this.A0D = C017009c.A00();
        this.A0b = AnonymousClass0D1.A00();
        this.A0W = C04420Kh.A00();
        this.A0J = AnonymousClass2IC.A00();
        this.A0g = C670036v.A00();
        this.A07 = new HashSet();
    }

    public Collection A0V() {
        ArrayList arrayList = new ArrayList();
        C47612Is r0 = this.A03;
        if (r0 != null) {
            arrayList.addAll(r0.values());
        } else {
            AbstractC007503q r1 = this.A04;
            if (r1 != null) {
                AnonymousClass01K r02 = this.A0O;
                if (r02.A0J.A05(r1.A0n) != null) {
                    arrayList.add(this.A04);
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public void A0W() {
        AbstractC06110Rt r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void A0X() {
        AbstractC06110Rt r1 = this.A00;
        if (r1 != null) {
            C47612Is r0 = this.A03;
            if (r0 == null || r0.size() == 0) {
                A0W();
            } else {
                r1.A01();
            }
        }
    }

    public boolean A0Y() {
        if (this instanceof StarredMessagesActivity) {
            StarredMessagesActivity starredMessagesActivity = (StarredMessagesActivity) this;
            if (((AnonymousClass2DW) starredMessagesActivity).A00 != null) {
                return false;
            }
            Log.i("starred/selectionrequested");
            starredMessagesActivity.A03.notifyDataSetChanged();
            ((AnonymousClass2DW) starredMessagesActivity).A00 = starredMessagesActivity.A0B(new C59302nQ(starredMessagesActivity, starredMessagesActivity, ((ActivityC004702f) starredMessagesActivity).A0F, starredMessagesActivity.A09, starredMessagesActivity.A0Y, starredMessagesActivity.A08, starredMessagesActivity.A0b, starredMessagesActivity.A0a, starredMessagesActivity.A0S, starredMessagesActivity.A0B, starredMessagesActivity.A0D, starredMessagesActivity.A0C, starredMessagesActivity.A0X, ((ActivityC004602e) starredMessagesActivity).A04, ((AnonymousClass2DW) starredMessagesActivity).A0F, starredMessagesActivity.A0I, starredMessagesActivity.A0G, ((AnonymousClass2C0) starredMessagesActivity).A01, starredMessagesActivity.A0T, ((AnonymousClass2DW) starredMessagesActivity).A0a, starredMessagesActivity.A0Z, starredMessagesActivity.A0R, starredMessagesActivity.A0U, ((AnonymousClass2DW) starredMessagesActivity).A0W, starredMessagesActivity.A0N, starredMessagesActivity.A0V));
            return true;
        } else if (!(this instanceof MediaAlbumActivity)) {
            Conversation conversation = (Conversation) this;
            if (((AnonymousClass2DW) conversation).A00 != null) {
                return false;
            }
            AbstractC06110Rt r0 = conversation.A0f;
            if (r0 != null) {
                r0.A00();
            }
            Log.i("conversation/selectionrequested");
            conversation.A0Y.setTranscriptMode(0);
            conversation.A0m();
            AbstractC06110Rt A0B2 = conversation.A0B(new AnonymousClass27J(conversation, conversation, ((ActivityC004702f) conversation).A0F, conversation.A29, conversation.A4B, conversation.A28, conversation.A4R, conversation.A4D, conversation.A3P, conversation.A2G, conversation.A2Z, conversation.A2K, conversation.A49, ((ActivityC004602e) conversation).A04, ((AnonymousClass2DW) conversation).A0F, conversation.A2p, conversation.A2d, ((AnonymousClass2C0) conversation).A01, conversation.A3W, conversation.A4A, conversation.A4C, conversation.A3D, ((AnonymousClass2DW) conversation).A0X, conversation.A3e, conversation.A37, conversation.A3y));
            ((AnonymousClass2DW) conversation).A00 = A0B2;
            conversation.A0q.A07 = A0B2;
            return true;
        } else {
            MediaAlbumActivity mediaAlbumActivity = (MediaAlbumActivity) this;
            if (((AnonymousClass2DW) mediaAlbumActivity).A00 != null) {
                return false;
            }
            Log.i("starred/selectionrequested");
            mediaAlbumActivity.A02.notifyDataSetChanged();
            ((AnonymousClass2DW) mediaAlbumActivity).A00 = mediaAlbumActivity.A0B(new C59282nO(mediaAlbumActivity, mediaAlbumActivity, ((ActivityC004702f) mediaAlbumActivity).A0F, mediaAlbumActivity.A03, mediaAlbumActivity.A0H, ((AnonymousClass2DW) mediaAlbumActivity).A0A, mediaAlbumActivity.A0K, mediaAlbumActivity.A0J, mediaAlbumActivity.A0D, mediaAlbumActivity.A05, ((AnonymousClass2DW) mediaAlbumActivity).A0E, ((AnonymousClass2DW) mediaAlbumActivity).A0C, mediaAlbumActivity.A0G, ((ActivityC004602e) mediaAlbumActivity).A04, ((AnonymousClass2DW) mediaAlbumActivity).A0F, mediaAlbumActivity.A09, mediaAlbumActivity.A08, ((AnonymousClass2C0) mediaAlbumActivity).A01, mediaAlbumActivity.A0E, mediaAlbumActivity.A0a, mediaAlbumActivity.A0I, mediaAlbumActivity.A0S, mediaAlbumActivity.A0X, mediaAlbumActivity.A0W, mediaAlbumActivity.A0A, mediaAlbumActivity.A0F));
            return true;
        }
    }

    @Override // X.AbstractC43421yL
    public synchronized void A1w(C007303n r5) {
        Map map = this.A08;
        if (map == null) {
            map = new HashMap();
            this.A08 = map;
        }
        map.put(r5, new AnonymousClass02R(0L, 0));
    }

    @Override // X.AbstractC43421yL
    public void A3i(C007303n r2) {
        Map map = this.A08;
        if (map != null) {
            map.remove(r2);
        }
    }

    @Override // X.AbstractC43421yL
    public void A4T(AbstractC007503q r9) {
        long j;
        int i;
        A0W();
        this.A04 = r9;
        Intent intent = new Intent(this, ContactPicker.class);
        boolean z = true;
        intent.putExtra("forward", true);
        intent.putExtra("forward_jid", AnonymousClass1VY.A0D(r9.A0n.A00));
        byte b = r9.A0m;
        intent.putIntegerArrayListExtra("message_types", new ArrayList<>(Collections.singleton(Integer.valueOf(Byte.valueOf(b).intValue()))));
        if (r9 instanceof AnonymousClass0ZC) {
            j = ((long) ((AnonymousClass0M3) r9).A00) * 1000;
        } else {
            j = 0;
        }
        intent.putExtra("forward_video_duration", j);
        if (b == 0) {
            String A0D2 = r9.A0D();
            if (A0D2 != null) {
                i = A0D2.length();
            } else {
                throw null;
            }
        } else {
            i = 0;
        }
        intent.putExtra("forward_text_length", i);
        C000300f r5 = this.A0B;
        int i2 = 1;
        if (!r5.A0D(AbstractC000400g.A11) || r9.A03 >= 127 || AnonymousClass0FI.A01(r9, r5) != 127) {
            i2 = 0;
        }
        intent.putExtra("forward_messages_becoming_frequently_forwarded", i2);
        intent.putExtra("forward_ctwa", r9.A0s(1024));
        if (r9.A03 < 127) {
            z = false;
        }
        intent.putExtra("forward_highly_forwarded", z);
        startActivityForResult(intent, 2);
    }

    @Override // X.AbstractC43421yL
    public AnonymousClass1KQ A4l() {
        return this.A01;
    }

    @Override // X.AbstractC43421yL
    public C51822a5 A5U() {
        if (!(this instanceof StarredMessagesActivity)) {
            return this.A0J.A01;
        }
        return this.A0J.A00;
    }

    @Override // X.AbstractC43421yL
    public synchronized int A5t(AnonymousClass0MO r5) {
        int i = ((AnonymousClass0M3) r5).A00;
        double d = (double) (i <= 1 ? 600 : (long) (i * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
        Double.isNaN(d);
        Double.isNaN(d);
        int max = Math.max(3, (int) Math.ceil(6000.0d / d));
        if (this.A08 == null) {
            return max;
        }
        AnonymousClass02R r0 = (AnonymousClass02R) this.A08.get(r5.A0n);
        if (r0 == null) {
            return max;
        }
        return max - ((Integer) r0.A01).intValue();
    }

    @Override // X.AbstractC03640Hb
    public AnonymousClass0D1 A9D() {
        return this.A0b;
    }

    @Override // X.AbstractC43421yL
    public int A9L(AbstractC007503q r4) {
        Number number;
        HashMap hashMap = this.A06;
        if (hashMap == null || (number = (Number) hashMap.get(r4.A0n)) == null) {
            return 0;
        }
        return number.intValue();
    }

    @Override // X.AbstractC43421yL
    public boolean AAO() {
        return this.A03 != null;
    }

    @Override // X.AbstractC43421yL
    public boolean ABK(AbstractC007503q r3) {
        C47612Is r1 = this.A03;
        return r1 != null && r1.containsKey(r3.A0n);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02s
    public void AKm(AbstractC06110Rt r3) {
        super.AKm(r3);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C004302a.A00(this, R.color.primary_dark));
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02s
    public void AKn(AbstractC06110Rt r3) {
        super.AKn(r3);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C004302a.A00(this, R.color.action_mode_dark));
        }
    }

    @Override // X.AbstractC43421yL
    public void ANT(AbstractC007503q r3) {
        GoogleSearchDialogFragment.A00(this, ((ActivityC004702f) this).A0F, this.A0B, r3);
    }

    @Override // X.AbstractC43421yL
    public void AP3(List list, boolean z) {
        if (this.A03 != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC007503q r2 = (AbstractC007503q) it.next();
                C47612Is r1 = this.A03;
                if (z) {
                    r1.put(r2.A0n, r2);
                } else {
                    r1.remove(r2.A0n);
                }
            }
            A0X();
        }
    }

    @Override // X.AbstractC43421yL
    public void APB(AbstractC007503q r4, int i) {
        HashMap hashMap = this.A06;
        if (hashMap == null) {
            hashMap = new HashMap();
            this.A06 = hashMap;
        }
        hashMap.put(r4.A0n, Integer.valueOf(i));
    }

    @Override // X.AbstractC43421yL
    public synchronized boolean APY(C007303n r8) {
        Map map = this.A08;
        boolean z = false;
        if (map == null) {
            return false;
        }
        AnonymousClass02R r1 = (AnonymousClass02R) map.get(r8);
        if (r1 != null) {
            long longValue = ((Long) r1.A00).longValue();
            int intValue = ((Integer) r1.A01).intValue();
            if (longValue < 6000 || intValue < 3) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.AbstractC43421yL
    public void AQ6(AbstractC007503q r6) {
        C47612Is r1 = new C47612Is(((ActivityC004702f) this).A0F, this.A0R, this.A03, new C51532Zc(this));
        this.A03 = r1;
        r1.put(r6.A0n, r6);
        A0Y();
        A0X();
    }

    @Override // X.AbstractC43421yL
    public boolean AQh(AbstractC007503q r4) {
        C47612Is r0 = this.A03;
        boolean z = false;
        if (r0 != null) {
            C007303n r1 = r4.A0n;
            if (r0.containsKey(r1)) {
                this.A03.remove(r1);
            } else {
                this.A03.put(r1, r4);
                z = true;
            }
            A0X();
        }
        return z;
    }

    @Override // X.AbstractC43421yL
    public void AQt(AnonymousClass0MO r7, long j) {
        long j2;
        C007303n r4 = r7.A0n;
        int i = ((AnonymousClass0M3) r7).A00;
        if (i <= 1) {
            j2 = 600;
        } else {
            j2 = (long) (i * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        }
        int i2 = (int) (j / j2);
        synchronized (this) {
            Map map = this.A08;
            if (map != null) {
                AnonymousClass02R r3 = (AnonymousClass02R) map.get(r4);
                if (r3 != null) {
                    long longValue = ((Long) r3.A00).longValue() + j;
                    int intValue = ((Integer) r3.A01).intValue();
                    if (i2 > 0) {
                        intValue += i2;
                    }
                    this.A08.put(r4, new AnonymousClass02R(Long.valueOf(longValue), Integer.valueOf(intValue)));
                }
            }
        }
    }

    @Override // X.AbstractC43421yL
    public void AQw(AbstractC007503q r3) {
        this.A07.add(r3.A0n);
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        List<AnonymousClass1Z3> list;
        super.onActivityResult(i, i2, intent);
        if (i == 41) {
            if (i2 == -1) {
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data != null) {
                        str = data.getLastPathSegment();
                    } else {
                        throw null;
                    }
                } else {
                    str = null;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                AnonymousClass1Z4 r0 = this.A09;
                if (!(r0 == null || (list = r0.A05) == null)) {
                    for (AnonymousClass1Z3 r1 : list) {
                        arrayList2.add(r1.A02);
                        UserJid userJid = r1.A01;
                        if (userJid != null) {
                            arrayList.add(userJid);
                        } else {
                            arrayList.add(null);
                        }
                    }
                    this.A0d.A03(arrayList2, arrayList, this.A09.A07(), str);
                }
            }
            this.A05.A00();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0J.A01(this);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = new AnonymousClass1KQ(((ActivityC004702f) this).A0F, this.A0N, this.A0Z, this.A0Y);
        AnonymousClass00Y r3 = this.A0V;
        C000300f r4 = this.A0B;
        this.A05 = new C09110cJ(r3, r4, super.A0I, this.A0M);
        this.A02 = new AnonymousClass2IG(this.A0L, r4, this.A0f, this.A0I, this.A0F, ((AnonymousClass2C0) this).A01, this.A0H, this.A0D, this.A0b);
        this.A0J.A01(this);
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 13) {
            C47612Is r2 = this.A03;
            if (r2 == null || r2.isEmpty()) {
                Log.e("conversation/dialog/delete no messages");
                return super.onCreateDialog(i);
            }
            StringBuilder A0S2 = AnonymousClass008.A0S("conversation/dialog/delete/");
            A0S2.append(r2.size());
            Log.i(A0S2.toString());
            AnonymousClass02M r5 = ((ActivityC004702f) this).A0F;
            AnonymousClass00S r6 = this.A0K;
            AnonymousClass00T r7 = this.A0e;
            C02590Cr r8 = super.A0M;
            C04360Kb r9 = this.A0C;
            AnonymousClass01A r3 = this.A0F;
            C014308b r22 = this.A0G;
            AnonymousClass01X r10 = ((AnonymousClass2C0) this).A01;
            AnonymousClass00D r11 = this.A0N;
            Collection values = this.A03.values();
            return C002001d.A0N(this, r5, r6, r7, r8, r9, r10, r11, values, new C39921sK(this, 13), true, new C51512Za(this), C002001d.A1t(values, r3, r22, null, r10));
        } else if (i != 19) {
            return super.onCreateDialog(i);
        } else {
            return C002001d.A0M(this, ((ActivityC004602e) this).A04, this.A0U, ((AnonymousClass2C0) this).A01, this.A0N, new C29891aN(this, 19));
        }
    }

    @Override // X.ActivityC03630Ha, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        C47612Is r0 = this.A03;
        if (r0 != null) {
            r0.A00();
            this.A03 = null;
        }
        AnonymousClass2IG r1 = this.A02;
        AnonymousClass0YX r02 = r1.A00;
        if (r02 != null) {
            r02.A00();
        }
        AnonymousClass0D1 r03 = r1.A01;
        if (r03 != null) {
            r03.A04();
        }
        AnonymousClass3SQ r04 = r1.A02;
        if (r04 != null) {
            r04.A07();
        }
        AnonymousClass1KQ r2 = this.A01;
        AnonymousClass1KO r12 = r2.A00;
        if (r12 != null) {
            r12.A04 = true;
            r12.interrupt();
            r2.A00 = null;
        }
        super.onDestroy();
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        synchronized (this) {
            Map map = this.A08;
            if (map != null) {
                map.clear();
            }
        }
        this.A0g.A01();
    }

    @Override // X.ActivityC03630Ha
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            List<C007303n> A0N2 = C006803i.A0N(bundle);
            if (A0N2 != null) {
                this.A03 = new C47612Is(((ActivityC004702f) this).A0F, this.A0R, this.A03, new C51532Zc(this));
                for (C007303n r2 : A0N2) {
                    AbstractC007503q A052 = this.A0O.A0J.A05(r2);
                    if (A052 != null) {
                        this.A03.put(r2, A052);
                    }
                }
                A0Y();
                A0X();
            }
            C007303n A092 = C006803i.A09(bundle, "");
            if (A092 != null) {
                this.A04 = this.A0O.A0J.A05(A092);
            }
        }
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C47612Is r0 = this.A03;
        if (r0 != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC007503q r02 : r0.values()) {
                arrayList.add(r02.A0n);
            }
            C006803i.A0U(bundle, arrayList);
        }
        AbstractC007503q r03 = this.A04;
        if (r03 != null) {
            C006803i.A0T(bundle, r03.A0n, "");
        }
    }
}
