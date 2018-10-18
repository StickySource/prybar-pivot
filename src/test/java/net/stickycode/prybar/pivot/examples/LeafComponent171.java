package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent171
    implements PrybarComponent {

  private RootComponent171 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent171.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent171.class, "root"));
  }

  public RootComponent171 getRoot() {
    return root;
  }

}
