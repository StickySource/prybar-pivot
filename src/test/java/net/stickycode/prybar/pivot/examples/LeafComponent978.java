package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent978
    implements PrybarComponent {

  private RootComponent978 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent978.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent978.class, "root"));
  }

  public RootComponent978 getRoot() {
    return root;
  }

}
