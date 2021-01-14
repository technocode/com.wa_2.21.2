package com.whatsapp.instrumentation.api;

import X.AnonymousClass008;
import X.AnonymousClass02N;
import X.AnonymousClass02U;
import X.AnonymousClass1VY;
import X.AnonymousClass2RE;
import X.AnonymousClass2RF;
import X.C007003k;
import X.C014708f;
import X.C28631Vd;
import X.C28751Vp;
import X.C28831Vx;
import X.C28841Vy;
import X.C55252gF;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Iterator;

public class InstrumentationProvider extends ContentProvider {
    public C28631Vd A00;
    public AnonymousClass2RF A01;
    public C28751Vp A02;
    public C28841Vy A03;
    public C014708f A04;
    public boolean A05;

    public String getType(Uri uri) {
        return null;
    }

    public boolean onCreate() {
        return false;
    }

    public final C28831Vx A00() {
        synchronized (this) {
            if (!this.A05) {
                if (getContext() != null) {
                    C28751Vp A002 = C28751Vp.A00();
                    C28631Vd A003 = C28631Vd.A00();
                    C28841Vy A004 = C28841Vy.A00();
                    C014708f A005 = C014708f.A00();
                    if (AnonymousClass2RF.A02 == null) {
                        synchronized (AnonymousClass2RF.class) {
                            if (AnonymousClass2RF.A02 == null) {
                                AnonymousClass2RF.A02 = new AnonymousClass2RF();
                            }
                        }
                    }
                    AnonymousClass2RF r0 = AnonymousClass2RF.A02;
                    this.A02 = A002;
                    this.A00 = A003;
                    this.A03 = A004;
                    this.A04 = A005;
                    this.A01 = r0;
                    this.A05 = true;
                } else {
                    throw new IllegalStateException("Context is not attached.");
                }
            }
        }
        if (this.A00.A01()) {
            C28831Vx A012 = this.A03.A01();
            if (this.A04.A02()) {
                synchronized (this.A00) {
                }
                if (Binder.getCallingUid() != Process.myUid()) {
                    C28751Vp r3 = this.A02;
                    if (!TextUtils.isEmpty(r3.A00.getString(C28751Vp.A01(A012.A01, "auth/token"), null))) {
                        return A012;
                    }
                    throw new SecurityException("Access denied: auth token is missing");
                }
                throw new SecurityException("Access checks is executed outside of binder context.");
            }
            throw new SecurityException("WhatsApp is not active.");
        }
        throw new SecurityException("Feature is disabled.");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        A00();
        throw new UnsupportedOperationException();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A00();
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C28831Vx A002 = A00();
        AnonymousClass2RF r2 = this.A01;
        if (r2.A00.match(uri) == 1) {
            C55252gF r22 = (C55252gF) r2.A01.get();
            if (r22 != null) {
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    ArrayList A0E = r22.A01.A0E();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = A0E.iterator();
                    while (it.hasNext()) {
                        C007003k r3 = (C007003k) it.next();
                        if (r22.A05.A02(r3)) {
                            if (r22.A04 == null) {
                                throw null;
                            } else if (r3.A02(AnonymousClass02N.class) != null && r3.A0X && !AnonymousClass1VY.A0T(r3.A09) && !r22.A00.A09(r3.A09) && AnonymousClass1VY.A0S(r3.A09)) {
                                if (r3.A09()) {
                                    Jid jid = r3.A09;
                                    if (jid instanceof AnonymousClass02U) {
                                        if (!r22.A03.A04((GroupJid) jid)) {
                                        }
                                    }
                                }
                                if (!TextUtils.isEmpty(r22.A02.A09(r3, false))) {
                                    arrayList.add(r3);
                                }
                            }
                        }
                    }
                    return new AnonymousClass2RE(strArr, arrayList, r22.A02, A002, r22.A04);
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } else {
                throw null;
            }
        } else {
            throw new SecurityException(AnonymousClass008.A0J("Access denied to ", uri));
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A00();
        throw new UnsupportedOperationException();
    }
}
