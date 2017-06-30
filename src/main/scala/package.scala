package era7bio.db

import ohnosequences.awstools.s3._

package object rna16s18s {

  val dbName = "era7bio.db.both16s18s"

  private val metadata = generated.metadata.rna16s18s

  val s3prefix: S3Folder =
    s3"resources.ohnosequences.com" /
    metadata.organization           /
    metadata.artifact               /
    metadata.version                /
}
