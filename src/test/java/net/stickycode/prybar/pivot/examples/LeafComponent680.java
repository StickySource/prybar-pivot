package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent680
    implements PrybarComponent {

  private RootComponent680 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent680.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent680.class, "root"));
  }

  public RootComponent680 getRoot() {
    return root;
  }

}
