import { ExclamationTriangleIcon } from "@radix-ui/react-icons"
import '../page.module.css'
import {
  Alert,
  AlertDescription,
  AlertTitle,
} from "@/components/ui/alert"

export function AlertDestructive() {
  return (
    <Alert variant="destructive" className="main_alert">
      
      <AlertTitle>Error</AlertTitle>
      <AlertDescription className="description">
       Wrong Credentials
      </AlertDescription>
    </Alert>
  )
}
