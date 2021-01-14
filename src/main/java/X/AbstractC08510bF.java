package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallerypicker.GifPreviewFragment;
import com.whatsapp.gallerypicker.ImagePreviewFragment;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import com.whatsapp.gallerypicker.MediaPreviewFragment;
import com.whatsapp.gallerypicker.VideoPreviewFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.0bF  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC08510bF extends AnonymousClass0YE {
    @Override // X.AnonymousClass0YE
    public final Object A05(ViewGroup viewGroup, int i) {
        StatusPlaybackContactFragment statusPlaybackContactFragment;
        AnonymousClass02R r6;
        if (this instanceof C75003bx) {
            C75003bx r5 = (C75003bx) this;
            StatusPlaybackActivity statusPlaybackActivity = r5.A05;
            AnonymousClass32N r0 = statusPlaybackActivity.A09;
            Object obj = r0.A01.get(((AnonymousClass3PP) r0.A00.get(i)).A00.A0A.getRawString());
            if (obj != null) {
                long longValue = ((Number) obj).longValue();
                C015008i r4 = r5.A02;
                Object A03 = r4.A03(longValue, null);
                r6 = A03;
                if (A03 == null) {
                    Bundle bundle = null;
                    if (r5.A01 == null) {
                        AnonymousClass0LW r1 = r5.A04;
                        if (r1 != null) {
                            r5.A01 = new AnonymousClass0QB(r1);
                        } else {
                            throw null;
                        }
                    }
                    AnonymousClass3PP r02 = (AnonymousClass3PP) statusPlaybackActivity.A09.A00.get(i);
                    if (r02 != null) {
                        C007303n r8 = statusPlaybackActivity.A08;
                        UserJid userJid = r02.A00.A0A;
                        if (r8 == null) {
                            boolean z = statusPlaybackActivity.A0F;
                            statusPlaybackContactFragment = new StatusPlaybackContactFragment();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("jid", userJid.getRawString());
                            bundle2.putBoolean("unseen_only", z);
                            statusPlaybackContactFragment.A0N(bundle2);
                        } else {
                            statusPlaybackContactFragment = new StatusPlaybackContactFragment();
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("jid", userJid.getRawString());
                            C006803i.A0T(bundle3, r8, "");
                            statusPlaybackContactFragment.A0N(bundle3);
                        }
                        statusPlaybackContactFragment.A0s(statusPlaybackActivity.A0G);
                        C15410o2 r12 = (C15410o2) r5.A03.A03(longValue, null);
                        if (r12 != null) {
                            if (((AnonymousClass037) statusPlaybackContactFragment).A0H == null) {
                                Bundle bundle4 = r12.A00;
                                if (bundle4 != null) {
                                    bundle = bundle4;
                                }
                                ((AnonymousClass037) statusPlaybackContactFragment).A07 = bundle;
                            } else {
                                throw new IllegalStateException("Fragment already added");
                            }
                        }
                        statusPlaybackContactFragment.A0S(false);
                        statusPlaybackContactFragment.A0T(false);
                        r4.A08(longValue, statusPlaybackContactFragment);
                        r5.A01.A0A(viewGroup.getId(), statusPlaybackContactFragment, AnonymousClass008.A0I("f", longValue), 1);
                        return statusPlaybackContactFragment;
                    }
                    throw new IllegalArgumentException("Unsupported StatusItem instance");
                }
            } else {
                throw null;
            }
        } else if (this instanceof AnonymousClass3Z2) {
            AnonymousClass3Z2 r52 = (AnonymousClass3Z2) this;
            if (!r52.A02.A0M()) {
                i = (r52.A01.length - 1) - i;
            }
            AbstractC63942xG r03 = r52.A01[i];
            if (r03 != null) {
                View AEg = r03.AEg(viewGroup, i);
                Iterator it = r52.A05.iterator();
                while (it.hasNext()) {
                    r52.A01[i].A1s((AbstractC16450pp) it.next());
                }
                String id = r52.A01[i].getId();
                AEg.setTag(id);
                r52.A00.put(id, r52.A01[i]);
                viewGroup.addView(AEg, 0);
                return AEg;
            }
            throw null;
        } else if (this instanceof C08500bE) {
            C08500bE r53 = (C08500bE) this;
            AnonymousClass02R A3V = r53.A00.A3V(i);
            Object obj2 = A3V.A00;
            r6 = A3V;
            if (obj2 != null) {
                View view = (View) obj2;
                Object obj3 = A3V.A01;
                if (MediaViewBaseFragment.A0H) {
                    r53.A01.A0y(view);
                }
                view.setTag(obj3);
                viewGroup.addView(view, 0);
                return A3V;
            }
        } else if (!(this instanceof C59792oI)) {
            AnonymousClass27L r54 = (AnonymousClass27L) this;
            C26621Lq r3 = r54.A01;
            View inflate = r3.A04.inflate(R.layout.emoji_list, (ViewGroup) null);
            AbsListView absListView = (AbsListView) inflate.findViewById(16908298);
            AnonymousClass01X r55 = r54.A00;
            if (!r55.A0M()) {
                i = (r3.A0D.length - 1) - i;
            }
            C26551Lj[] r42 = r3.A0D;
            if (r42[i] == null) {
                r42[i] = new C26551Lj(r3, r3.A0G, r55, i);
            }
            absListView.setAdapter((ListAdapter) r3.A0D[i]);
            absListView.setEmptyView(inflate.findViewById(16908292));
            absListView.setTag(Integer.valueOf(i));
            if (i == r3.A00) {
                absListView.setOnScrollListener(r3.A0K);
            }
            viewGroup.addView(inflate, 0);
            r6 = inflate;
        } else {
            C59792oI r56 = (C59792oI) this;
            MediaPreviewActivity mediaPreviewActivity = r56.A04;
            Object obj4 = mediaPreviewActivity.A1G.get(mediaPreviewActivity.A0T.get(r56.A0G(i)));
            if (obj4 != null) {
                long longValue2 = ((Number) obj4).longValue();
                AnonymousClass0QC r32 = r56.A02;
                AnonymousClass037 r7 = null;
                if (r32 == null) {
                    AnonymousClass0LW r04 = r56.A01;
                    if (r04 != null) {
                        r32 = new AnonymousClass0QB(r04);
                        r56.A02 = r32;
                    } else {
                        throw null;
                    }
                }
                C015008i r82 = r56.A03;
                AnonymousClass037 r62 = (AnonymousClass037) r82.A03(longValue2, null);
                if (r62 != null) {
                    r32.A07(new C09130cL(7, r62));
                    return r62;
                }
                Uri uri = (Uri) mediaPreviewActivity.A0T.get(r56.A0G(i));
                AnonymousClass2PG A00 = mediaPreviewActivity.A14.A00(uri);
                byte A04 = MediaPreviewActivity.A04(mediaPreviewActivity.A1C, A00);
                A00.A09(Byte.valueOf(A04));
                if (A04 == 1) {
                    r7 = new ImagePreviewFragment();
                    Bundle bundle5 = new Bundle();
                    bundle5.putParcelable("uri", uri);
                    r7.A0N(bundle5);
                } else if (A04 == 3) {
                    r7 = new VideoPreviewFragment();
                    Bundle bundle6 = new Bundle();
                    bundle6.putParcelable("uri", uri);
                    r7.A0N(bundle6);
                } else if (A04 == 13) {
                    r7 = new GifPreviewFragment();
                    Bundle bundle7 = new Bundle();
                    bundle7.putParcelable("uri", uri);
                    r7.A0N(bundle7);
                }
                r7.A0S(false);
                r7.A0T(false);
                r82.A08(longValue2, r7);
                r56.A02.A0A(viewGroup.getId(), r7, AnonymousClass008.A0I("f", longValue2), 1);
                return r7;
            }
            throw null;
        }
        return r6;
    }

    @Override // X.AnonymousClass0YE
    public final void A0D(ViewGroup viewGroup, int i, Object obj) {
        C59792oI r2;
        AnonymousClass037 r6;
        AnonymousClass037 r0;
        if (this instanceof C75003bx) {
            C75003bx r22 = (C75003bx) this;
            AnonymousClass037 r62 = (AnonymousClass037) obj;
            AnonymousClass037 r02 = r22.A00;
            if (r62 != r02) {
                if (r02 != null) {
                    r02.A0S(false);
                    r22.A00.A0T(false);
                }
                r62.A0S(true);
                r62.A0T(true);
                r22.A00 = r62;
            }
        } else if ((this instanceof C59792oI) && (r6 = (AnonymousClass037) obj) != (r0 = (r2 = (C59792oI) this).A00)) {
            if (r0 != null) {
                r0.A0S(false);
                r2.A00.A0T(false);
            }
            r6.A0S(true);
            r6.A0T(true);
            r2.A00 = r6;
        }
    }

    public int A0F(Object obj) {
        Object obj2;
        if (this instanceof C75003bx) {
            C75003bx r1 = (C75003bx) this;
            AnonymousClass037 r6 = (AnonymousClass037) obj;
            if (r6 instanceof StatusPlaybackFragment) {
                StatusPlaybackActivity statusPlaybackActivity = r1.A05;
                int A00 = statusPlaybackActivity.A09.A00(((StatusPlaybackFragment) r6).A0n());
                if (A00 < 0 || A00 >= statusPlaybackActivity.A09.A00.size()) {
                    return -2;
                }
                return A00;
            }
            return -2;
        } else if (this instanceof AnonymousClass3Z2) {
            AnonymousClass3Z2 r4 = (AnonymousClass3Z2) this;
            Object tag = ((View) obj).getTag();
            HashMap hashMap = r4.A04;
            if (!hashMap.containsKey(tag)) {
                r4.A03.remove(tag);
                return -2;
            }
            int intValue = ((Number) hashMap.get(tag)).intValue();
            HashMap hashMap2 = r4.A03;
            if (hashMap2.containsKey(tag) && intValue == ((Number) hashMap2.get(tag)).intValue()) {
                return -1;
            }
            hashMap2.put(tag, Integer.valueOf(intValue));
            return intValue;
        } else if (this instanceof C08500bE) {
            C08500bE r2 = (C08500bE) this;
            AnonymousClass02R r62 = (AnonymousClass02R) obj;
            if (r62.A00 == null || (obj2 = r62.A01) == null) {
                return -2;
            }
            return r2.A00.A8T(obj2);
        } else if (!(this instanceof C59792oI)) {
            return -1;
        } else {
            C59792oI r22 = (C59792oI) this;
            int indexOf = r22.A04.A0T.indexOf(((MediaPreviewFragment) ((AnonymousClass037) obj)).A00);
            if (indexOf < 0) {
                return -2;
            }
            return r22.A0G(indexOf);
        }
    }
}
