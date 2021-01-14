package com.whatsapp.gallerypicker;

import X.AbstractC06100Rs;
import X.AbstractC06110Rt;
import X.AbstractC48882Od;
import X.ActivityC004702f;
import X.ActivityC004802g;
import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass02R;
import X.AnonymousClass037;
import X.AnonymousClass08D;
import X.AnonymousClass0L7;
import X.AnonymousClass0Q7;
import X.AnonymousClass1PN;
import X.AnonymousClass1VY;
import X.AnonymousClass2PB;
import X.AnonymousClass2PC;
import X.AnonymousClass2PE;
import X.AnonymousClass2PG;
import X.AnonymousClass2UT;
import X.C002001d;
import X.C006803i;
import X.C08340aw;
import X.C14460mJ;
import X.C28051Sr;
import X.C54102eM;
import X.C59592ny;
import X.C60522pc;
import X.C69733Ie;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class MediaPickerFragment extends MediaGalleryFragmentBase {
    public int A00;
    public int A01 = Integer.MAX_VALUE;
    public BroadcastReceiver A02;
    public AbstractC06100Rs A03 = new C54102eM(this);
    public AbstractC06110Rt A04;
    public AnonymousClass02N A05;
    public boolean A06;
    public boolean A07 = true;
    public final AnonymousClass02M A08 = AnonymousClass02M.A00();
    public final AnonymousClass1PN A09 = AnonymousClass1PN.A00();
    public final AnonymousClass08D A0A = AnonymousClass08D.A00();
    public final AnonymousClass01X A0B = AnonymousClass01X.A00();
    public final C08340aw A0C = new C08340aw();
    public final AnonymousClass0L7 A0D = AnonymousClass0L7.A00();
    public final HashSet A0E = new LinkedHashSet();

    @Override // X.AnonymousClass037, com.whatsapp.gallery.MediaGalleryFragmentBase
    public void A0b(Bundle bundle) {
        ArrayList parcelableArrayListExtra;
        String str;
        ContentResolver contentResolver;
        String str2;
        super.A0b(bundle);
        ActivityC004802g r4 = (ActivityC004802g) A0A();
        if (r4 != null) {
            Intent intent = r4.getIntent();
            this.A01 = intent.getIntExtra("max_items", Integer.MAX_VALUE);
            this.A07 = intent.getBooleanExtra("preview", true);
            boolean booleanExtra = intent.getBooleanExtra("is_in_multi_select_mode_only", false);
            this.A06 = booleanExtra;
            if (booleanExtra) {
                this.A04 = r4.A0B(this.A03);
            }
            this.A05 = AnonymousClass02N.A01(intent.getStringExtra("jid"));
            this.A00 = 7;
            ActivityC004702f r7 = (ActivityC004702f) A0A();
            if (r7 != null) {
                Intent intent2 = r7.getIntent();
                if (intent2 != null) {
                    String resolveType = intent2.resolveType(r7);
                    if (resolveType != null) {
                        if (resolveType.equals("vnd.android.cursor.dir/image") || resolveType.equals("image/*")) {
                            this.A00 = 1;
                            r7.setTitle(this.A0B.A06(R.string.pick_photos_gallery_title));
                        }
                        if (resolveType.equals("vnd.android.cursor.dir/video") || resolveType.equals("video/*")) {
                            this.A00 = 4;
                            r7.setTitle(this.A0B.A06(R.string.pick_videos_gallery_title));
                        }
                    }
                    Bundle extras = intent2.getExtras();
                    if (extras != null) {
                        str2 = extras.getString("window_title");
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        r7.A0L(str2);
                    }
                    if (extras != null) {
                        this.A00 = 7 & extras.getInt("include_media", this.A00);
                    }
                }
                if (bundle != null) {
                    parcelableArrayListExtra = bundle.getParcelableArrayList("android.intent.extra.STREAM");
                } else {
                    parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                }
                if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                    HashSet hashSet = this.A0E;
                    hashSet.clear();
                    hashSet.addAll(parcelableArrayListExtra);
                    this.A04 = r4.A0B(this.A03);
                    ((MediaGalleryFragmentBase) this).A06.A01.A00();
                }
                Uri data = intent.getData();
                if (data != null) {
                    str = data.toString();
                } else {
                    str = "";
                }
                StringBuilder sb = new StringBuilder("mediapickerfragment/create/");
                sb.append(str);
                Log.i(sb.toString());
                A0I();
                ActivityC004902h A0A2 = A0A();
                if (A0A2 == null) {
                    contentResolver = null;
                } else {
                    contentResolver = A0A2.getContentResolver();
                }
                A0v(false, AnonymousClass2PB.A01(contentResolver));
                AnonymousClass0L7 r2 = this.A0D;
                StickyHeadersRecyclerView stickyHeadersRecyclerView = ((MediaGalleryFragmentBase) this).A07;
                if (r2 != null) {
                    r2.A03(stickyHeadersRecyclerView.getContext());
                    stickyHeadersRecyclerView.A0l(new C69733Ie(r2));
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallery.MediaGalleryFragmentBase
    public void A0c() {
        super.A0c();
        this.A03 = null;
        this.A04 = null;
        int childCount = ((MediaGalleryFragmentBase) this).A07.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = ((MediaGalleryFragmentBase) this).A07.getChildAt(i);
            if (childAt instanceof C60522pc) {
                ((ImageView) childAt).setImageDrawable(null);
            }
        }
    }

    @Override // X.AnonymousClass037
    public void A0d() {
        this.A0U = true;
        BroadcastReceiver broadcastReceiver = this.A02;
        if (broadcastReceiver != null) {
            ActivityC004902h A0A2 = A0A();
            if (A0A2 != null) {
                A0A2.unregisterReceiver(broadcastReceiver);
                this.A02 = null;
                return;
            }
            throw null;
        }
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallery.MediaGalleryFragmentBase
    public void A0e() {
        super.A0e();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addDataScheme("file");
        AnonymousClass2PC r1 = new AnonymousClass2PC(this);
        this.A02 = r1;
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null) {
            A0A2.registerReceiver(r1, intentFilter);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0g(int i, int i2, Intent intent) {
        if (i == 1) {
            ActivityC004802g r2 = (ActivityC004802g) A0A();
            if (r2 == null) {
                throw null;
            } else if (i2 == -1) {
                r2.setResult(-1, intent);
                r2.finish();
            } else if (i2 == 2) {
                r2.setResult(2);
                r2.finish();
            } else if (i2 == 1) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                HashSet hashSet = this.A0E;
                hashSet.clear();
                if (parcelableArrayListExtra != null) {
                    hashSet.addAll(parcelableArrayListExtra);
                }
                AbstractC06110Rt r0 = this.A04;
                if (r0 == null) {
                    this.A04 = r2.A0B(this.A03);
                } else {
                    r0.A01();
                }
                this.A0C.A01(intent.getExtras());
                ((MediaGalleryFragmentBase) this).A06.A01.A00();
            }
        }
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallery.MediaGalleryFragmentBase
    public void A0j(Bundle bundle) {
        bundle.putInt("sort_type", ((MediaGalleryFragmentBase) this).A02);
        bundle.putParcelableArrayList("android.intent.extra.STREAM", new ArrayList<>(this.A0E));
    }

    @Override // X.AnonymousClass037
    public void A0k(Menu menu, MenuInflater menuInflater) {
        if (this.A01 > 1) {
            menu.add(0, R.id.menuitem_select_multiple, 0, this.A0B.A06(R.string.select_multiple)).setIcon(C002001d.A0b(A00(), R.drawable.ic_action_select_multiple_teal, R.color.tealActionBarItemDrawableTint)).setShowAsAction(2);
        }
    }

    @Override // X.AnonymousClass037
    public boolean A0m(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_select_multiple) {
            return false;
        }
        ActivityC004802g r1 = (ActivityC004802g) A0A();
        if (r1 != null) {
            this.A04 = r1.A0B(this.A03);
            ((MediaGalleryFragmentBase) this).A06.A01.A00();
            return true;
        }
        throw null;
    }

    public final void A0y(AbstractC48882Od r6) {
        if (r6 != null) {
            if (A0w()) {
                HashSet hashSet = this.A0E;
                Uri A4W = r6.A4W();
                if (hashSet.contains(A4W)) {
                    hashSet.remove(A4W);
                    this.A0C.A00.remove(A4W);
                } else {
                    int size = hashSet.size();
                    int i = this.A01;
                    if (size < i) {
                        hashSet.add(A4W);
                        this.A0C.A03(new AnonymousClass2PG(A4W));
                    } else {
                        this.A08.A0C(C28051Sr.A0s(this.A0B, i), 0);
                    }
                }
                if (hashSet.isEmpty()) {
                    AbstractC06110Rt r0 = this.A04;
                    if (r0 != null) {
                        r0.A00();
                    } else {
                        throw null;
                    }
                } else {
                    AbstractC06110Rt r02 = this.A04;
                    if (r02 != null) {
                        r02.A01();
                        AnonymousClass02M r4 = this.A08;
                        r4.A02.postDelayed(new RunnableEBaseShape9S0100000_I1_4(this, 39), 300);
                    } else {
                        throw null;
                    }
                }
                ((MediaGalleryFragmentBase) this).A06.A01.A00();
                return;
            }
            HashSet hashSet2 = new HashSet();
            Uri A4W2 = r6.A4W();
            hashSet2.add(A4W2);
            this.A0C.A03(new AnonymousClass2PG(A4W2));
            A0z(hashSet2);
        }
    }

    public final void A0z(HashSet hashSet) {
        if (hashSet != null && !hashSet.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(hashSet);
            ActivityC004902h A0A2 = A0A();
            if (A0A2 != null) {
                Uri uri = null;
                if (this.A07) {
                    AnonymousClass2PE r9 = new AnonymousClass2PE(A0A2);
                    r9.A09 = arrayList;
                    r9.A07 = AnonymousClass1VY.A0D(this.A05);
                    r9.A00 = this.A01;
                    r9.A01 = A0A2.getIntent().getIntExtra("origin", 1);
                    r9.A02 = A0A2.getIntent().getLongExtra("picker_open_time", 0);
                    r9.A0C = true;
                    r9.A03 = A0A2.getIntent().getLongExtra("quoted_message_row_id", 0);
                    r9.A08 = A0A2.getIntent().getStringExtra("quoted_group_jid");
                    r9.A0B = true;
                    r9.A0A = A0A2.getIntent().getBooleanExtra("number_from_url", false);
                    C08340aw r2 = this.A0C;
                    AnonymousClass2PG A002 = r2.A00((Uri) arrayList.get(0));
                    List A0G = AnonymousClass1VY.A0G(UserJid.class, A0A2.getIntent().getStringArrayListExtra("mentions"));
                    Iterator it = new ArrayList(r2.A00.values()).iterator();
                    while (it.hasNext()) {
                        AnonymousClass2PG r1 = (AnonymousClass2PG) it.next();
                        r1.A0A(null);
                        r1.A0B(null);
                    }
                    if (!((AbstractCollection) A0G).isEmpty()) {
                        A002.A0B(C006803i.A0M(A0G));
                    }
                    String stringExtra = A0A2.getIntent().getStringExtra("android.intent.extra.TEXT");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        A002.A0A(stringExtra);
                    }
                    Bundle bundle = new Bundle();
                    r2.A02(bundle);
                    r9.A06 = bundle;
                    if (!AnonymousClass2UT.A00 || arrayList.size() != 1 || ((AnonymousClass037) this).A0A == null) {
                        A0A2.startActivityForResult(r9.A00(), 1);
                        return;
                    }
                    Uri uri2 = (Uri) arrayList.get(0);
                    C59592ny A0o = A0o(uri2);
                    if (A0o != null) {
                        r9.A05 = uri2;
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new AnonymousClass02R(A0o, uri2.toString()));
                        View findViewById = ((AnonymousClass037) this).A0A.findViewById(R.id.header_transition);
                        arrayList2.add(new AnonymousClass02R(findViewById, AnonymousClass0Q7.A0G(findViewById)));
                        View findViewById2 = ((AnonymousClass037) this).A0A.findViewById(R.id.transition_clipper_bottom);
                        AnonymousClass0Q7.A0g(findViewById2, this.A09.A01(R.string.transition_footer));
                        arrayList2.add(new AnonymousClass02R(findViewById2, AnonymousClass0Q7.A0G(findViewById2)));
                        View findViewById3 = ((AnonymousClass037) this).A0A.findViewById(R.id.gallery_filter_swipe_transition);
                        arrayList2.add(new AnonymousClass02R(findViewById3, AnonymousClass0Q7.A0G(findViewById3)));
                        View findViewById4 = ((AnonymousClass037) this).A0A.findViewById(R.id.gallery_send_button_transition);
                        arrayList2.add(new AnonymousClass02R(findViewById4, AnonymousClass0Q7.A0G(findViewById4)));
                        Bitmap bitmap = A0o.A00;
                        if (bitmap != null) {
                            this.A0A.A03().A05(C28051Sr.A0q(uri2), bitmap);
                        }
                        A0A2.startActivityForResult(r9.A00(), 1, C14460mJ.A00(A0A2, (AnonymousClass02R[]) arrayList2.toArray(new AnonymousClass02R[0])).A01());
                        return;
                    }
                    A0A2.startActivityForResult(r9.A00(), 1);
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("bucket_uri", A0A2.getIntent().getData());
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                if (arrayList.size() == 1) {
                    uri = (Uri) arrayList.get(0);
                }
                intent.setData(uri);
                A0A2.setResult(-1, intent);
                A0A2.finish();
                return;
            }
            throw null;
        }
    }
}
