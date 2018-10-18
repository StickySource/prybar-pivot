package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent936
    implements PrybarComponent {

  private RootComponent936 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent936.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent936.class, "root"));
  }

  public RootComponent936 getRoot() {
    return root;
  }

}
