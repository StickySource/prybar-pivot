package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent626
    implements PrybarComponent {

  private RootComponent626 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent626.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent626.class, "root"));
  }

  public RootComponent626 getRoot() {
    return root;
  }

}
