package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.2hZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55792hZ implements AnonymousClass1B8 {
    public final /* synthetic */ LocationPicker2 A00;

    public /* synthetic */ C55792hZ(LocationPicker2 locationPicker2) {
        this.A00 = locationPicker2;
    }

    @Override // X.AnonymousClass1B8
    public final void AHS(AnonymousClass1B5 r10) {
        LocationPicker2 locationPicker2 = this.A00;
        if (locationPicker2.A01 == null) {
            locationPicker2.A01 = r10;
            if (r10 == null) {
                return;
            }
            if (r10 != null) {
                locationPicker2.A06 = new AnonymousClass2SG(r10);
                r10.A0E(false);
                AnonymousClass1B5 r0 = locationPicker2.A01;
                if (r0 != null) {
                    try {
                        r0.A01.AON(true);
                        if (locationPicker2.A0I.A04() && !locationPicker2.A08.A0t) {
                            locationPicker2.A01.A0D(true);
                        }
                        AnonymousClass1B5 r2 = locationPicker2.A01;
                        AbstractC49792Sd r02 = locationPicker2.A08;
                        r2.A07(0, 0, Math.max(r02.A00, r02.A02));
                        AnonymousClass1BA A01 = locationPicker2.A01.A01();
                        if (A01 != null) {
                            try {
                                A01.A00.AOb(false);
                                try {
                                    locationPicker2.A01.A01.AOO(new BinderC457626g(new C56162iB(locationPicker2)));
                                    try {
                                        locationPicker2.A01.A01.AOj(new AnonymousClass26e(new C55812hb(locationPicker2)));
                                        try {
                                            locationPicker2.A01.A01.AOg(new BinderC457526f(new C55842he(locationPicker2)));
                                            try {
                                                locationPicker2.A01.A01.AOi(new BinderC457926j(new C55822hc(locationPicker2)));
                                                try {
                                                    locationPicker2.A01.A01.AOf(new BinderC457726h(new C55802ha(locationPicker2)));
                                                    try {
                                                        locationPicker2.A01.A01.AOe(new BinderC457826i(new C55832hd(locationPicker2)));
                                                        locationPicker2.A08.A0T(false, null);
                                                        AbstractC49792Sd r1 = locationPicker2.A08;
                                                        AnonymousClass1N1 r03 = r1.A0a;
                                                        if (r03 != null && !r03.places.isEmpty()) {
                                                            r1.A05();
                                                        }
                                                        Bundle bundle = locationPicker2.A00;
                                                        if (bundle != null) {
                                                            locationPicker2.A07.setLocationMode(bundle.getInt("map_location_mode", 2));
                                                            if (locationPicker2.A00.containsKey("camera_zoom")) {
                                                                locationPicker2.A01.A09(C008805h.A0H(new LatLng(locationPicker2.A00.getDouble("camera_lat"), locationPicker2.A00.getDouble("camera_lng")), locationPicker2.A00.getFloat("camera_zoom")));
                                                            }
                                                            locationPicker2.A00 = null;
                                                        } else {
                                                            SharedPreferences A012 = locationPicker2.A0S.A01(AnonymousClass020.A02);
                                                            locationPicker2.A01.A09(C008805h.A0H(new LatLng((double) A012.getFloat("share_location_lat", 37.389805f), (double) A012.getFloat("share_location_lon", -122.08141f)), A012.getFloat("share_location_zoom", 15.0f) - 0.2f));
                                                        }
                                                        if (C002001d.A3E(locationPicker2)) {
                                                            locationPicker2.A01.A0C(C36001lQ.A00(locationPicker2, R.raw.night_map_style_json));
                                                        }
                                                    } catch (RemoteException e) {
                                                        throw new AnonymousClass06B(e);
                                                    }
                                                } catch (RemoteException e2) {
                                                    throw new AnonymousClass06B(e2);
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
                        } else {
                            throw null;
                        }
                    } catch (RemoteException e8) {
                        throw new AnonymousClass06B(e8);
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
