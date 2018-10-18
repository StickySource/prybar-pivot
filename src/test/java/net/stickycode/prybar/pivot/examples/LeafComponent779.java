package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent779
    implements PrybarComponent {

  private RootComponent779 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent779.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent779.class, "root"));
  }

  public RootComponent779 getRoot() {
    return root;
  }

}
