package X;

import android.content.SharedPreferences;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.2hO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55682hO implements AnonymousClass1B8 {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    public /* synthetic */ C55682hO(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A00 = groupChatLiveLocationsActivity2;
    }

    @Override // X.AnonymousClass1B8
    public final void AHS(AnonymousClass1B5 r10) {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        if (groupChatLiveLocationsActivity2.A06 == null) {
            groupChatLiveLocationsActivity2.A06 = r10;
            if (r10 != null) {
                r10.A07(0, 0, groupChatLiveLocationsActivity2.A01);
                groupChatLiveLocationsActivity2.A01 = 0;
                if (groupChatLiveLocationsActivity2.A06 != null) {
                    AnonymousClass022 r7 = groupChatLiveLocationsActivity2.A0T;
                    String str = AnonymousClass020.A02;
                    int i = 0;
                    boolean z = r7.A01(str).getBoolean("live_location_show_traffic", false);
                    groupChatLiveLocationsActivity2.A06.A0E(z);
                    MenuItem menuItem = groupChatLiveLocationsActivity2.A03;
                    if (menuItem != null) {
                        menuItem.setChecked(z);
                    }
                    groupChatLiveLocationsActivity2.A06.A06(r7.A01(str).getInt("live_location_map_type", 1));
                    AnonymousClass1B5 r0 = groupChatLiveLocationsActivity2.A06;
                    if (r0 != null) {
                        try {
                            r0.A01.AON(true);
                            AnonymousClass1BA A01 = groupChatLiveLocationsActivity2.A06.A01();
                            if (A01 != null) {
                                try {
                                    A01.A00.AO4(true);
                                    AnonymousClass1BA A012 = groupChatLiveLocationsActivity2.A06.A01();
                                    if (A012 != null) {
                                        try {
                                            A012.A00.APR(false);
                                            AnonymousClass1BA A013 = groupChatLiveLocationsActivity2.A06.A01();
                                            if (A013 != null) {
                                                try {
                                                    A013.A00.AOb(false);
                                                    try {
                                                        groupChatLiveLocationsActivity2.A06.A01.AOO(new BinderC457626g(new C55982hs(groupChatLiveLocationsActivity2)));
                                                        try {
                                                            groupChatLiveLocationsActivity2.A06.A01.AOj(new AnonymousClass26e(new C55702hQ(groupChatLiveLocationsActivity2)));
                                                            try {
                                                                groupChatLiveLocationsActivity2.A06.A01.AOf(new BinderC457726h(new C55692hP(groupChatLiveLocationsActivity2)));
                                                                try {
                                                                    groupChatLiveLocationsActivity2.A06.A01.AOe(new BinderC457826i(new C55712hR(groupChatLiveLocationsActivity2)));
                                                                    try {
                                                                        groupChatLiveLocationsActivity2.A06.A01.AOi(new BinderC457926j(new C55722hS(groupChatLiveLocationsActivity2)));
                                                                        try {
                                                                            groupChatLiveLocationsActivity2.A06.A01.AOg(new BinderC457526f(new C55732hT(groupChatLiveLocationsActivity2)));
                                                                            groupChatLiveLocationsActivity2.A0V();
                                                                            if (groupChatLiveLocationsActivity2.A02 != null) {
                                                                                AbstractView$OnCreateContextMenuListenerC56112i5 r2 = groupChatLiveLocationsActivity2.A08;
                                                                                View view = r2.A0U;
                                                                                if (!r2.A0u || r2.A0m != null) {
                                                                                    i = 8;
                                                                                }
                                                                                view.setVisibility(i);
                                                                                groupChatLiveLocationsActivity2.A07.setLocationMode(groupChatLiveLocationsActivity2.A02.getInt("map_location_mode", 2));
                                                                                if (groupChatLiveLocationsActivity2.A02.containsKey("camera_zoom")) {
                                                                                    groupChatLiveLocationsActivity2.A06.A09(C008805h.A0H(new LatLng(groupChatLiveLocationsActivity2.A02.getDouble("camera_lat"), groupChatLiveLocationsActivity2.A02.getDouble("camera_lng")), groupChatLiveLocationsActivity2.A02.getFloat("camera_zoom")));
                                                                                }
                                                                                groupChatLiveLocationsActivity2.A02 = null;
                                                                            } else if (groupChatLiveLocationsActivity2.A0A.isEmpty()) {
                                                                                SharedPreferences A014 = r7.A01(str);
                                                                                groupChatLiveLocationsActivity2.A06.A09(C008805h.A0G(new LatLng((double) A014.getFloat("live_location_lat", 37.389805f), (double) A014.getFloat("live_location_lng", -122.08141f))));
                                                                                AnonymousClass1B5 r3 = groupChatLiveLocationsActivity2.A06;
                                                                                float f = A014.getFloat("live_location_zoom", 16.0f) - 0.2f;
                                                                                try {
                                                                                    ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = C008805h.A02;
                                                                                    C001801b.A1R(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
                                                                                    IObjectWrapper ARe = iCameraUpdateFactoryDelegate.ARe(f);
                                                                                    C001801b.A1Q(ARe);
                                                                                    try {
                                                                                        r3.A01.ACA(ARe);
                                                                                    } catch (RemoteException e) {
                                                                                        throw new AnonymousClass06B(e);
                                                                                    }
                                                                                } catch (RemoteException e2) {
                                                                                    throw new AnonymousClass06B(e2);
                                                                                }
                                                                            } else {
                                                                                groupChatLiveLocationsActivity2.A0X(false);
                                                                            }
                                                                            if (C002001d.A3E(groupChatLiveLocationsActivity2)) {
                                                                                groupChatLiveLocationsActivity2.A06.A0C(C36001lQ.A00(groupChatLiveLocationsActivity2, R.raw.night_map_style_json));
                                                                            }
                                                                        } catch (RemoteException e3) {
                                                                            throw new AnonymousClass06B(e3);
                                                                        }
                                                                    } catch (RemoteException e4) {
                                                                        throw new AnonymousClass06B(e4);
                                                                    }
                                                                } catch (RemoteException e5) {
                                                                    throw new AnonymousClass06B(e5);
                                                                }
                                                            } catch (RemoteException e6) {
                                                                throw new AnonymousClass06B(e6);
                                                            }
                                                        } catch (RemoteException e7) {
                                                            throw new AnonymousClass06B(e7);
                                                        }
                                                    } catch (RemoteException e8) {
                                                        throw new AnonymousClass06B(e8);
                                                    }
                                                } catch (RemoteException e9) {
                                                    throw new AnonymousClass06B(e9);
                                                }
                                            } else {
                                                throw null;
                                            }
                                        } catch (RemoteException e10) {
                                            throw new AnonymousClass06B(e10);
                                        }
                                    } else {
                                        throw null;
                                    }
                                } catch (RemoteException e11) {
                                    throw new AnonymousClass06B(e11);
                                }
                            } else {
                                throw null;
                            }
                        } catch (RemoteException e12) {
                            throw new AnonymousClass06B(e12);
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
        }
    }
}
