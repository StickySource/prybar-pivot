package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent410
    implements PrybarComponent {

  private RootComponent410 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent410.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent410.class, "root"));
  }

  public RootComponent410 getRoot() {
    return root;
  }

}
