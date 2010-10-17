public class bx extends dj
{
  public int a = 0;

  public bx(dy paramdy) {
    super(paramdy);
    this.e = true;
    a(0.98F, 0.98F);
    this.C = (this.E / 2.0F);
  }

  public bx(dy paramdy, float paramFloat1, float paramFloat2, float paramFloat3) {
    this(paramdy);

    a(paramFloat1, paramFloat2, paramFloat3);

    float f = (float)(Math.random() * 3.141592741012573D * 2.0D);
    this.o = (-gj.a(f * 3.141593F / 180.0F) * 0.02F);
    this.p = 0.2000000029802322D;
    this.q = (-gj.b(f * 3.141593F / 180.0F) * 0.02F);

    this.H = false;
    this.a = 80;

    this.i = paramFloat1;
    this.j = paramFloat2;
    this.k = paramFloat3;
  }

  public boolean c_() {
    return !this.B;
  }

  public void b_() {
    this.i = this.l;
    this.j = this.m;
    this.k = this.n;

    this.p -= 0.03999999910593033D;
    c(this.o, this.p, this.q);
    this.o *= 0.9800000190734863D;
    this.p *= 0.9800000190734863D;
    this.q *= 0.9800000190734863D;

    if (this.w) {
      this.o *= 0.699999988079071D;
      this.q *= 0.699999988079071D;
      this.p *= -0.5D;
    }

    if (this.a-- <= 0) {
      j();
	  if (etc.getInstance().allowTNT()) {
		b();
	}
    }
    else
      this.h.a("smoke", this.l, this.m + 0.5D, this.n, 0.0D, 0.0D, 0.0D);
  }

  private void b()
  {
    float f = 4.0F;
    this.h.a(null, this.l, this.m, this.n, f);
  }

  protected void a(s params)
  {
    params.a("Fuse", (byte)this.a);
  }

  protected void b(s params) {
    this.a = params.b("Fuse");
  }
}