package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent41
    implements PrybarComponent {

  private RootComponent41 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent41.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent41.class, "root"));
  }

  public RootComponent41 getRoot() {
    return root;
  }

}
