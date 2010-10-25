import java.util.Random;

public class hy
  implements bj
{
  private Random j;
  private ev k;
  private ev l;
  private ev m;
  private ev n;
  private ev o;
  public ev a;
  public ev b;
  public ev c;
  private dy p;
  private double[] q;
  private double[] r = new double[256];
  private double[] s = new double[256];
  private double[] t = new double[256];

  private em u = new dn();
  double[] d;
  double[] e;
  double[] f;
  double[] g;
  double[] h;
  int[][] i = new int[32][32];

  public hy(dy paramdy, long paramLong)
  {
    this.p = paramdy;

    this.j = new Random(paramLong);
    this.k = new ev(this.j, 16);
    this.l = new ev(this.j, 16);
    this.m = new ev(this.j, 8);
    this.n = new ev(this.j, 4);
    this.o = new ev(this.j, 4);

    this.a = new ev(this.j, 10);
    this.b = new ev(this.j, 16);

    this.c = new ev(this.j, 8);
  }

  public void a(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    int i1 = 4;
    int i2 = 64;

    int i3 = i1 + 1;
    int i4 = 17;
    int i5 = i1 + 1;
    this.q = a(this.q, paramInt1 * i1, 0, paramInt2 * i1, i3, i4, i5);

    for (int i6 = 0; i6 < i1; i6++)
      for (int i7 = 0; i7 < i1; i7++)
        for (int i8 = 0; i8 < 16; i8++) {
          double d1 = 0.125D;
          double d2 = this.q[(((i6 + 0) * i5 + (i7 + 0)) * i4 + (i8 + 0))];
          double d3 = this.q[(((i6 + 0) * i5 + (i7 + 1)) * i4 + (i8 + 0))];
          double d4 = this.q[(((i6 + 1) * i5 + (i7 + 0)) * i4 + (i8 + 0))];
          double d5 = this.q[(((i6 + 1) * i5 + (i7 + 1)) * i4 + (i8 + 0))];

          double d6 = (this.q[(((i6 + 0) * i5 + (i7 + 0)) * i4 + (i8 + 1))] - d2) * d1;
          double d7 = (this.q[(((i6 + 0) * i5 + (i7 + 1)) * i4 + (i8 + 1))] - d3) * d1;
          double d8 = (this.q[(((i6 + 1) * i5 + (i7 + 0)) * i4 + (i8 + 1))] - d4) * d1;
          double d9 = (this.q[(((i6 + 1) * i5 + (i7 + 1)) * i4 + (i8 + 1))] - d5) * d1;

          for (int i9 = 0; i9 < 8; i9++) {
            double d10 = 0.25D;

            double d11 = d2;
            double d12 = d3;
            double d13 = (d4 - d2) * d10;
            double d14 = (d5 - d3) * d10;

            for (int i10 = 0; i10 < 4; i10++) {
              int i11 = i10 + i6 * 4 << 11 | 0 + i7 * 4 << 7 | i8 * 8 + i9;
              int i12 = 128;
              double d15 = 0.25D;

              double d16 = d11;
              double d17 = (d12 - d11) * d15;
              for (int i13 = 0; i13 < 4; i13++) {
                int i14 = 0;
                if (i8 * 8 + i9 < i2) {
                  if ((this.p.d) && (i8 * 8 + i9 >= i2 - 1))
                    i14 = ff.aU.bc;
                  else {
                    i14 = ff.C.bc;
                  }
                }
                if (d16 > 0.0D) {
                  i14 = ff.u.bc;
                }

                paramArrayOfByte[i11] = (byte)i14;
                i11 += i12;
                d16 += d17;
              }
              d11 += d13;
              d12 += d14;
            }

            d2 += d6;
            d3 += d7;
            d4 += d8;
            d5 += d9;
          }
        }
  }

  public void b(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    int i1 = 64;

    double d1 = 0.03125D;
    this.r = this.n.a(this.r, paramInt1 * 16, paramInt2 * 16, 0.0D, 16, 16, 1, d1, d1, 1.0D);
    this.s = this.n.a(this.s, paramInt2 * 16, 109.0134D, paramInt1 * 16, 16, 1, 16, d1, 1.0D, d1);
    this.t = this.o.a(this.t, paramInt1 * 16, paramInt2 * 16, 0.0D, 16, 16, 1, d1 * 2.0D, d1 * 2.0D, d1 * 2.0D);

    for (int i2 = 0; i2 < 16; i2++)
      for (int i3 = 0; i3 < 16; i3++) {
        int i4 = this.r[(i2 + i3 * 16)] + this.j.nextDouble() * 0.2D > 0.0D ? 1 : 0;
        int i5 = this.s[(i2 + i3 * 16)] + this.j.nextDouble() * 0.2D > 3.0D ? 1 : 0;
        int i6 = (int)(this.t[(i2 + i3 * 16)] / 3.0D + 3.0D + this.j.nextDouble() * 0.25D);

        int i7 = -1;

        int i8 = (byte)ff.v.bc;
        int i9 = (byte)ff.w.bc;

        for (int i10 = 127; i10 >= 0; i10--) {
          int i11 = (i2 * 16 + i3) * 128 + i10;

          if (i10 <= 0 + this.j.nextInt(6) - 1) {
            paramArrayOfByte[i11] = (byte)ff.A.bc;
          } else {
            int i12 = paramArrayOfByte[i11];

            if (i12 == 0)
              i7 = -1;
            else if (i12 == ff.u.bc)
              if (i7 == -1) {
                if (i6 <= 0) {
                  i8 = 0;
                  i9 = (byte)ff.u.bc;
                } else if ((i10 >= i1 - 4) && (i10 <= i1 + 1)) {
                  i8 = (byte)ff.v.bc;
                  i9 = (byte)ff.w.bc;
                  if (i5 != 0) i8 = 0;
                  if (i5 != 0) i9 = (byte)ff.G.bc;
                  if (i4 != 0) i8 = (byte)ff.F.bc;
                  if (i4 != 0) i9 = (byte)ff.F.bc;
                }

                if ((i10 < i1) && (i8 == 0)) i8 = (byte)ff.C.bc;

                i7 = i6;
                if (i10 >= i1 - 1) paramArrayOfByte[i11] = (byte) i8; else
                  paramArrayOfByte[i11] = (byte) i9;
              } else if (i7 > 0) {
                i7--;
                paramArrayOfByte[i11] = (byte) i9;
              }
          }
        }
      }
  }

  public im b(int paramInt1, int paramInt2)
  {
    this.j.setSeed(paramInt1 * 341873128712L + paramInt2 * 132897987541L);

    byte[] arrayOfByte = new byte[32768];
    im localim = new im(this.p, arrayOfByte, paramInt1, paramInt2);
	
	int big1 = paramInt1 * 16;
	int big2 = paramInt2 * 16;
	
	int[] mapLimits = new int[] {0,0,0};
	mapLimits = etc.getInstance().getLimits();
	
	int distance = Math.max(Math.abs(big1 - mapLimits[0]), Math.abs(big2 - mapLimits[1]));
	
	int mapLimit = mapLimits[2];
	
	int shift1 = big1 >> 4;
	int shift2 = big2 >> 4;
	int mask1 = big1 & 0xF;
	int mask2 = big2 & 0xF;
	
	//System.out.println("Generating chunk (" + Integer.toString(big1) + ","+ Integer.toString(big2)+") - "+Integer.toString(shift1)+","+Integer.toString(shift2)+" " +Integer.toString(mask1)+","+Integer.toString(mask2) + " : " + Integer.toString(distance));
		
    
	if (distance >= (mapLimit+1)) // hard limit
	{
		System.out.println("Generating void chunk (" + Integer.toString(big1) + ","+ Integer.toString(big2)+") - "+Integer.toString(distance));
		arrayOfByte = new byte[32768];
	}
	else if (distance >= (mapLimit-15) && distance <= (mapLimit)) // soft limit
	{
		System.out.println("Generating border chunk (" + Integer.toString(big1) + ","+ Integer.toString(big2)+") - "+Integer.toString(distance));
		for(int k1 = 0; k1 < 32768; k1++) {
			arrayOfByte[k1] = 48; // Lots of moss.
		}
	}
	else
	{
		a(paramInt1, paramInt2, arrayOfByte);
		b(paramInt1, paramInt2, arrayOfByte);
		
		this.u.a(this, this.p, paramInt1, paramInt2, arrayOfByte);	
	}
	
    
    localim.b();

    return localim;
  }

  private double[] a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (paramArrayOfDouble == null) {
      paramArrayOfDouble = new double[paramInt4 * paramInt5 * paramInt6];
    }

    double d1 = 684.41200000000003D;
    double d2 = 684.41200000000003D;

    this.g = this.a.a(this.g, paramInt1, paramInt2, paramInt3, paramInt4, 1, paramInt6, 1.0D, 0.0D, 1.0D);
    this.h = this.b.a(this.h, paramInt1, paramInt2, paramInt3, paramInt4, 1, paramInt6, 100.0D, 0.0D, 100.0D);

    this.d = this.m.a(this.d, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1 / 80.0D, d2 / 160.0D, d1 / 80.0D);
    this.e = this.k.a(this.e, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
    this.f = this.l.a(this.f, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);

    int i1 = 0;
    int i2 = 0;

    for (int i3 = 0; i3 < paramInt4; i3++)
    {
      for (int i4 = 0; i4 < paramInt6; i4++)
      {
        double d3 = (this.g[i2] + 256.0D) / 512.0D;
        if (d3 > 1.0D) d3 = 1.0D;

        double d4 = 0.0D;

        double d5 = this.h[i2] / 8000.0D;
        if (d5 < 0.0D) d5 = -d5;

        d5 = d5 * 3.0D - 3.0D;

        if (d5 < 0.0D) {
          d5 /= 2.0D;
          if (d5 < -1.0D) d5 = -1.0D;
          d5 /= 1.4D;
          d5 /= 2.0D;
          d3 = 0.0D;
        } else {
          if (d5 > 1.0D) d5 = 1.0D;
          d5 /= 6.0D;
        }

        d3 += 0.5D;

        d5 = d5 * paramInt5 / 16.0D;

        double d6 = paramInt5 / 2.0D + d5 * 4.0D;

        i2++;

        for (int i5 = 0; i5 < paramInt5; i5++) {
          double d7 = 0.0D;

          double d8 = (i5 - d6) * 12.0D / d3;
          if (d8 < 0.0D) d8 *= 4.0D;

          double d9 = this.e[i1] / 512.0D;
          double d10 = this.f[i1] / 512.0D;

          double d11 = (this.d[i1] / 10.0D + 1.0D) / 2.0D;
          if (d11 < 0.0D) d7 = d9;
          else if (d11 > 1.0D) d7 = d10; else
            d7 = d9 + (d10 - d9) * d11;
          d7 -= d8;
          double d12;
          if (i5 > paramInt5 - 4) {
            d12 = (i5 - (paramInt5 - 4)) / 3.0F;
            d7 = d7 * (1.0D - d12) + -10.0D * d12;
          }

          if (i5 < d4) {
            d12 = (d4 - i5) / 4.0D;
            if (d12 < 0.0D) d12 = 0.0D;
            if (d12 > 1.0D) d12 = 1.0D;
            d7 = d7 * (1.0D - d12) + -10.0D * d12;
          }

          paramArrayOfDouble[i1] = d7;
          i1++;
        }
      }
    }
    return paramArrayOfDouble;
  }

  public boolean a(int paramInt1, int paramInt2) {
    return true;
  }

  public void a(bj parambj, int paramInt1, int paramInt2)
  {
    ey.a = true;
    int i1 = paramInt1 * 16;
    int i2 = paramInt2 * 16;

    this.j.setSeed(this.p.t);
    long l1 = this.j.nextLong() / 2L * 2L + 1L;
    long l2 = this.j.nextLong() / 2L * 2L + 1L;
    this.j.setSeed(paramInt1 * l1 + paramInt2 * l2 ^ this.p.t);
    double d1 = 0.25D;
	int i3;
    int i4;
	int i5;
    int i6;
    for (i3 = 0; i3 < 8; i3++) {
      i4 = i1 + this.j.nextInt(16) + 8;
      i5 = this.j.nextInt(128);
      i6 = i2 + this.j.nextInt(16) + 8;
      new dk().a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 10; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(128);
      i6 = i2 + this.j.nextInt(16);
      new f(32).a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 20; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(128);
      i6 = i2 + this.j.nextInt(16);
      new eg(ff.w.bc, 32).a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 10; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(128);
      i6 = i2 + this.j.nextInt(16);
      new eg(ff.G.bc, 32).a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 20; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(128);
      i6 = i2 + this.j.nextInt(16);
      new eg(ff.J.bc, 16).a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 20; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(64);
      i6 = i2 + this.j.nextInt(16);
      new eg(ff.I.bc, 8).a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 2; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(32);
      i6 = i2 + this.j.nextInt(16);
      new eg(ff.H.bc, 8).a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 8; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(16);
      i6 = i2 + this.j.nextInt(16);
      new eg(ff.aO.bc, 7).a(this.p, this.j, i4, i5, i6);
    }

    for (i3 = 0; i3 < 1; i3++) {
      i4 = i1 + this.j.nextInt(16);
      i5 = this.j.nextInt(16);
      i6 = i2 + this.j.nextInt(16);
      new eg(ff.ax.bc, 7).a(this.p, this.j, i4, i5, i6);
    }

    d1 = 0.5D;
    i3 = (int)((this.c.a(i1 * d1, i2 * d1) / 8.0D + this.j.nextDouble() * 4.0D + 4.0D) / 3.0D);
    if (i3 < 0) i3 = 0;
    if (this.j.nextInt(10) == 0) i3++;
    Object localObject = new ic();
    if (this.j.nextInt(10) == 0)
      localObject = new gi();
    int i7;
    for (i5 = 0; i5 < i3; i5++) {
      i6 = i1 + this.j.nextInt(16) + 8;
      i7 = i2 + this.j.nextInt(16) + 8;
      ((bc)localObject).a(1.0D, 1.0D, 1.0D);
      ((bc)localObject).a(this.p, this.j, i6, this.p.c(i6, i7), i7);
    }
    int i8;
    for (i5 = 0; i5 < 2; i5++) {
      i6 = i1 + this.j.nextInt(16) + 8;
      i7 = this.j.nextInt(128);
      i8 = i2 + this.j.nextInt(16) + 8;
      new ar(ff.ae.bc).a(this.p, this.j, i6, i7, i8);
    }

    if (this.j.nextInt(2) == 0) {
      i5 = i1 + this.j.nextInt(16) + 8;
      i6 = this.j.nextInt(128);
      i7 = i2 + this.j.nextInt(16) + 8;
      new ar(ff.af.bc).a(this.p, this.j, i5, i6, i7);
    }

    if (this.j.nextInt(4) == 0) {
      i5 = i1 + this.j.nextInt(16) + 8;
      i6 = this.j.nextInt(128);
      i7 = i2 + this.j.nextInt(16) + 8;
      new ar(ff.ag.bc).a(this.p, this.j, i5, i6, i7);
    }

    if (this.j.nextInt(8) == 0) {
      i5 = i1 + this.j.nextInt(16) + 8;
      i6 = this.j.nextInt(128);
      i7 = i2 + this.j.nextInt(16) + 8;
      new ar(ff.ah.bc).a(this.p, this.j, i5, i6, i7);
    }

    for (i5 = 0; i5 < 10; i5++) {
      i6 = i1 + this.j.nextInt(16) + 8;
      i7 = this.j.nextInt(128);
      i8 = i2 + this.j.nextInt(16) + 8;
      new gl().a(this.p, this.j, i6, i7, i8);
    }

    for (i5 = 0; i5 < 1; i5++) {
      i6 = i1 + this.j.nextInt(16) + 8;
      i7 = this.j.nextInt(128);
      i8 = i2 + this.j.nextInt(16) + 8;
      new eq().a(this.p, this.j, i6, i7, i8);
    }

    for (i5 = 0; i5 < 50; i5++) {
      i6 = i1 + this.j.nextInt(16) + 8;
      i7 = this.j.nextInt(this.j.nextInt(120) + 8);
      i8 = i2 + this.j.nextInt(16) + 8;
      new hr(ff.B.bc).a(this.p, this.j, i6, i7, i8);
    }

    for (i5 = 0; i5 < 20; i5++) {
      i6 = i1 + this.j.nextInt(16) + 8;
      i7 = this.j.nextInt(this.j.nextInt(this.j.nextInt(112) + 8) + 8);
      i8 = i2 + this.j.nextInt(16) + 8;
      new hr(ff.D.bc).a(this.p, this.j, i6, i7, i8);
    }

    for (i5 = i1 + 8 + 0; i5 < i1 + 8 + 16; i5++) {
      for (i6 = i2 + 8 + 0; i6 < i2 + 8 + 16; i6++) {
        i7 = this.p.d(i5, i6);
        if ((!this.p.d) || 
          (i7 <= 0) || (i7 >= 128) || (this.p.a(i5, i7, i6) != 0) || (!this.p.c(i5, i7 - 1, i6).c()) || 
          (this.p.c(i5, i7 - 1, i6) == iq.r)) continue; this.p.d(i5, i7, i6, ff.aT.bc);
      }

    }

    ey.a = false;
  }

  public boolean a(boolean paramBoolean, hw paramhw) {
    return true;
  }

  public boolean a() {
    return false;
  }

  public boolean b() {
    return true;
  }
}