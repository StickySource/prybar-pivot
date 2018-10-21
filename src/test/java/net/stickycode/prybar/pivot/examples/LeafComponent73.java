package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent73
    implements PrybarComponent {

  private RootComponent73 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent73.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent73.class, "root"));
  }

  public RootComponent73 getRoot() {
    return root;
  }

}
