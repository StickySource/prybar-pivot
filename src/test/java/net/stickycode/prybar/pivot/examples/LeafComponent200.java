package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent200
    implements PrybarComponent {

  private RootComponent200 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent200.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent200.class, "root"));
  }

  public RootComponent200 getRoot() {
    return root;
  }

}
